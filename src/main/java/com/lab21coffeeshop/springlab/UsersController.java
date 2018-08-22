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
	
	@RequestMapping("/")
	public ModelAndView registration() {
		return new ModelAndView("registration","users",dao.findAll());
	}
	
	@RequestMapping("/addnewuser")
	public ModelAndView addNew(@RequestParam ("id")String id,
								@RequestParam("fName") String fName, 
								@RequestParam("lName") String lName,
								@RequestParam("email") String email,
								@RequestParam("phone") String phone) {
		
		dao.insertUser(id, fName, lName, email, phone);
		
		return new ModelAndView("registration", "users", dao.findAll());
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteUser(@RequestParam("id")String id) {
		dao.deleteUser(id);
		
		return new ModelAndView("registration", "customers", dao.findAll());
	}

}
