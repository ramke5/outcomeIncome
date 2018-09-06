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

import ba.ramke.outcomeIncome.model.Place;
import ba.ramke.outcomeIncome.repository.PlaceRepository;
//import ba.ramke.outcomeIncome.service.PlaceManager;

@Controller
@RequestMapping(value = "/place")
public class PlaceController {
	@Autowired
	private PlaceRepository placeRepository;
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(final HttpServletRequest request) {
       ModelAndView mav = new ModelAndView("place/add");
       try {
    	   Place place = new Place();
	        mav.addObject("place", place);        	
       } catch (Exception e){

       }
       return mav;
   }
   
   @RequestMapping(value = "/add", method = RequestMethod.POST)
   public ModelAndView add(
   		final @ModelAttribute @Valid Place place, 
   		final BindingResult bindingResult, 
   		final RedirectAttributes redirectAttributes,
   		final HttpServletRequest request)  {
       ModelAndView mav = new ModelAndView("place/add");
       
       try {
	        mav = new ModelAndView("redirect:/");
	        place.setDateCreated(new Date());
	        place.setDateUpdated(new Date());
	        placeRepository.save(place);
	        
	} catch (Exception e) {
		// TODO: handle exception
	}	       
       return mav;
   }
}