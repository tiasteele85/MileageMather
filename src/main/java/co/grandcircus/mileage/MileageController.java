package co.grandcircus.mileage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("/mileage-form");
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResults(
			@RequestParam("mpg") double mpg,
			@RequestParam("gallons") double gallons) {
		
			double results = mpg * gallons;
		
			ModelAndView mv = new ModelAndView("/mileage-result");
			mv.addObject("mpg",mpg);
			mv.addObject("gallons", gallons);
			mv.addObject("results", results);
		
			return mv;
	}
	
	@RequestMapping("/add-form")
	public ModelAndView showAddForm() {
		return new ModelAndView("/add-form");
	}
	
	@RequestMapping("/add-result")
	public ModelAndView showAddResults(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
			double results = num1 + num2;
		
			ModelAndView mv = new ModelAndView("/add-result");
			mv.addObject("num1",num1);
			mv.addObject("num2", num2);
			mv.addObject("results", results);
		
			return mv;
	}
	
	@RequestMapping("/divide-form")
	public ModelAndView showDivideForm() {
		return new ModelAndView("/divide-form");
	}
	
	@RequestMapping("/divide-result")
	public ModelAndView showDivideResults(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
			double results = num1 / num2;
		
			ModelAndView mv = new ModelAndView("/divide-result");
			mv.addObject("num1",num1);
			mv.addObject("num2", num2);
			mv.addObject("results", results);
		
			return mv;
	}
	
	@RequestMapping("/repeat-form")
	public ModelAndView showRepeatForm() {
		return new ModelAndView("/repeat-form");
	}
	
	@RequestMapping("/repeat-result")
	public ModelAndView showRepeatResults(
			@RequestParam("num") int num,
			@RequestParam("str") String str) {
		
			String collector= "";
			for(int i = 0; i < num; i++) {
				collector += str + " ";
			} 
		
			ModelAndView mv = new ModelAndView("/repeat-result");
			
			mv.addObject("results", collector);
		
			return mv;
	}
}
