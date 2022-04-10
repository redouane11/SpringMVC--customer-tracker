package com.redouaneadr.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redouaneadr.springdemo.dao.CustomerDAO;
import com.redouaneadr.springdemo.entity.Customer;


@Controller
@RequestMapping("/customer")
public class CustromerController {
	
	// need to inject the customer dao
	@Autowired
	CustomerDAO customerDAO;
	
	
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
}
