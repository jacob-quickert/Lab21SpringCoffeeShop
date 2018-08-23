package com.lab21coffeeshop.springlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lab21coffeeshop.springlab.dao.UsersJdbcDao;

@Controller
public class UsersController {
	
	@Autowired
	UsersJdbcDao dao;
	
	
	
	@RequestMapping("/registration")
	public ModelAndView registration() {
		
		return new ModelAndView("registration", "users", dao.findAll()); // string methods in the controller class return the view
	}
//	@RequestParam ("id")int id,
	@RequestMapping("/addnewuser")
	public ModelAndView addNew(
								@RequestParam("fName") String fName, 
								@RequestParam("lName") String lName,
								@RequestParam("email") String email,
								@RequestParam("phone") String phone) {
		
		dao.insertUser( fName, lName, email, phone);
		
		return new ModelAndView("registration", "users", dao.findAll());
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteUser(@RequestParam("id")int id) {
		dao.deleteUser(id);
		
		return new ModelAndView("registration", "users", dao.findAll());
	}

}
