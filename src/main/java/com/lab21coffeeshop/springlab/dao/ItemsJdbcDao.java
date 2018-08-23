package com.lab21coffeeshop.springlab.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lab21coffeeshop.springlab.entity.Items;

@Repository
public class ItemsJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Items> itemsFindAll(){
		
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));
	}
	
}
