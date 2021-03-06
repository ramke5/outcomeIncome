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

import ba.ramke.outcomeIncome.model.Category;
import ba.ramke.outcomeIncome.repository.CategoryRepository;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(final HttpServletRequest request) {
       ModelAndView mav = new ModelAndView("category/add");
       try {
    	   Category category = new Category();
	        mav.addObject("category", category);        	
       } catch (Exception e){

       }
       return mav;
   }
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	   public ModelAndView add(
	   		final @ModelAttribute @Valid Category category, 
	   		final BindingResult bindingResult, 
	   		final RedirectAttributes redirectAttributes,
	   		final HttpServletRequest request)  {
	       ModelAndView mav = new ModelAndView("category/add");
	       
	       try {
		        mav = new ModelAndView("redirect:/");
		        category.setDateCreated(new Date());
		        category.setDateUpdated(new Date());
		        categoryRepository.save(category);
		        
		} catch (Exception e) {
			// TODO: handle exception
		}	       
	       return mav;
	   }
	}