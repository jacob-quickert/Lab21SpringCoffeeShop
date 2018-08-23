package com.lab21coffeeshop.springlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lab21coffeeshop.springlab.dao.ItemsJdbcDao;

@Controller
public class ItemsController {
	
	@Autowired
	ItemsJdbcDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index","items",dao.itemsFindAll());
	}
}
