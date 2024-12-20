package com.gentech.relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.relation.entity.Customer;
import com.gentech.relation.service.CustomerService;

@RestController
@RequestMapping(name = "/api/v1")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerService.createCustomer(customer), HttpStatus.CREATED);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers()
	{
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomers(), HttpStatus.OK);
	}
	
}
