package com.lab21coffeeshop.springlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {
	@RequestMapping("/")
	public ModelAndView indexPage() {
		return new ModelAndView("index", "test", "Hello World!");
	}
	@RequestMapping("/registration")
	public String testPage() {
		return "registration"; // string methods in the controller class return the view
	}
	
	@RequestMapping("username")
	public ModelAndView formData(@RequestParam("firstName") String fName,@RequestParam("lastName") String lName,@RequestParam("eMail") String eM,@RequestParam("phoneNumber") String pNum,@RequestParam("password") String pWord, @RequestParam("confirm_password") String cPWord) {
		return new ModelAndView("greetuser", "personName", fName);
	}
}
