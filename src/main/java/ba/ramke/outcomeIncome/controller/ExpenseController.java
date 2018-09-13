package ba.ramke.outcomeIncome.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ba.ramke.outcomeIncome.model.Category;
import ba.ramke.outcomeIncome.model.Expense;
import ba.ramke.outcomeIncome.model.Item;
import ba.ramke.outcomeIncome.model.PaymentMethod;
import ba.ramke.outcomeIncome.model.Place;
import ba.ramke.outcomeIncome.repository.CategoryRepository;
import ba.ramke.outcomeIncome.repository.ExpenseRepository;
import ba.ramke.outcomeIncome.repository.ItemRepository;
import ba.ramke.outcomeIncome.repository.PaymentMethodRepository;
import ba.ramke.outcomeIncome.repository.PlaceRepository;

@Controller
@RequestMapping(value = "/expense")
public class ExpenseController {
	
	@DateTimeFormat(pattern = "MM/dd/yyyy") 
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	 SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	 dateFormat.setLenient(false);
	 webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	 }
	
	@Autowired
	private ExpenseRepository expenseRepository;
	@Autowired
	private PaymentMethodRepository paymentMethodRepository;
	@Autowired
	private PlaceRepository placeRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ItemRepository itemRepository;
	
	Logger logger = LoggerFactory.getLogger(ExpenseController.class);
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(final HttpServletRequest request) {
       ModelAndView mav = new ModelAndView("expense/add");
       try {
    	   List<PaymentMethod> paymentMethods = paymentMethodRepository.findAll();
    	   List<Place> places = placeRepository.findAll();
    	   List<Category> categories = categoryRepository.findAll();
    	   
    	   Expense expense = new Expense();
    	   List<Item> items = new ArrayList<Item>();
    	   Item item = new Item();
    	   item.setName("");
    	   items.add(item);
    	   expense.setItems(items);
    	   
    	   mav.addObject("expense", expense);
	       mav.addObject("paymentMethods", paymentMethods);
	       mav.addObject("places", places);
	       mav.addObject("categories", categories);
       } catch (Exception e){
			System.out.println(e.getMessage());
       }
       return mav;
   }
   
   @RequestMapping(value = "/add", method = RequestMethod.POST)
   public ModelAndView add(
   		final @ModelAttribute @Valid Expense expense, 
   		final BindingResult bindingResult, 
   		final RedirectAttributes redirectAttributes,
   		final HttpServletRequest request)  {
       ModelAndView mav = new ModelAndView("expense/add");
       try {
	        mav = new ModelAndView("redirect:/");
	        expense.setDateCreated(new Date());
	        expense.setDateUpdated(new Date());
	        expense.setDate(expense.getDate());
	        itemRepository.save(expense.getItems());
	        expenseRepository.save(expense);
	        
	} catch (Exception e) {
		// TODO: handle exception
	}	       
       return mav;
   }
}
