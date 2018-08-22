package com.lab21coffeeshop.springlab.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lab21coffeeshop.springlab.entity.Users;

@Repository
public class UsersJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// select * from users
		public List<Users> findAll(){
			
			return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<Users>(Users.class));
		}
		
		public int insertUser( String id, String fName, String lName, String email, String phone) {
			String insertQuery = "INSERT INTO users(id, firstName, lastName, email, phone)"
					+ " values(?,?,?,?,?)";
			
			return jdbcTemplate.update(insertQuery, fName, lName, email, phone);
		}
		
		public int deleteUser(String id) {
			String deleteQuery = "DELETE FROM users WHERE idUsers = ?";
			return jdbcTemplate.update(deleteQuery, id);
		}
}
