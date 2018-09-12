package ba.ramke.outcomeIncome.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ba.ramke.outcomeIncome.model.PaymentIncome;
import ba.ramke.outcomeIncome.model.PaymentMethod;
import ba.ramke.outcomeIncome.repository.PaymentIncomeRepository;
import ba.ramke.outcomeIncome.repository.PaymentMethodRepository;

@Controller
@RequestMapping(value = "/paymentIncome")
public class PaymentIncomeController {
	
	@Autowired
	private PaymentIncomeRepository paymentIncomeRepository;
	@Autowired
	private PaymentMethodRepository paymentMethodRepository;
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(final HttpServletRequest request) {
       ModelAndView mav = new ModelAndView("paymentIncome/add");
       try {
    	   List<PaymentMethod> paymentMethods = paymentMethodRepository.findAll();
    	   PaymentIncome paymentIncome = new PaymentIncome();    	   
	       mav.addObject("paymentIncome", paymentIncome);
	       mav.addObject("paymentMethods", paymentMethods);
       } catch (Exception e){
			System.out.println(e.getMessage());
       }
       return mav;
   }
   
   @RequestMapping(value = "/add", method = RequestMethod.POST)
   public ModelAndView add(
   		final @ModelAttribute @Valid PaymentIncome paymentIncome, 
   		final BindingResult bindingResult, 
   		final RedirectAttributes redirectAttributes,
   		final HttpServletRequest request)  {
       ModelAndView mav = new ModelAndView("paymentIncome/add");
       
       try {
	        mav = new ModelAndView("redirect:/");
	        paymentIncome.setDateCreated(new Date());
	        paymentIncome.setDateUpdated(new Date());
	        paymentIncomeRepository.save(paymentIncome);
	        
	} catch (Exception e) {
		// TODO: handle exception
	}	       
       return mav;
   }
}
