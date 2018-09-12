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

import ba.ramke.outcomeIncome.model.PaymentMethod;
import ba.ramke.outcomeIncome.repository.PaymentMethodRepository;

@Controller
@RequestMapping(value = "/paymentMethod")
public class PaymentMethodController {
	@Autowired
	private PaymentMethodRepository paymentMethodRepository;
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(final HttpServletRequest request) {
       ModelAndView mav = new ModelAndView("paymentMethod/add");
       try {
    	   PaymentMethod paymentMethod = new PaymentMethod();
	        mav.addObject("paymentMethod", paymentMethod);        	
       } catch (Exception e){

       }
       return mav;
   }
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	   public ModelAndView add(
	   		final @ModelAttribute @Valid PaymentMethod paymentMethod, 
	   		final BindingResult bindingResult, 
	   		final RedirectAttributes redirectAttributes,
	   		final HttpServletRequest request)  {
	       ModelAndView mav = new ModelAndView("paymentMethod/add");
	       
	       try {
		        mav = new ModelAndView("redirect:/");
		        paymentMethod.setDateCreated(new Date());
		        paymentMethod.setDateUpdated(new Date());
		        paymentMethodRepository.save(paymentMethod);
		        
		} catch (Exception e) {
			// TODO: handle exception
		}	       
	       return mav;
	   }
	}