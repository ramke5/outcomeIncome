package ba.ramke.outcomeIncome.controller;

import java.util.Date;

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
import ba.ramke.outcomeIncome.repository.PaymentIncomeRepository;

@Controller
@RequestMapping(value = "/paymentIncome")
public class PaymentIncomeController {
	@Autowired
	private PaymentIncomeRepository paymentIncomeRepository;
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(final HttpServletRequest request) {
       ModelAndView mav = new ModelAndView("paymentIncome/add");
       try {
    	   PaymentIncome paymentIncome = new PaymentIncome();
	        mav.addObject("paymentIncome", paymentIncome);        	
       } catch (Exception e){

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
