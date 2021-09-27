package com.mtbademo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mtbademo.entities.Customer;
import com.mtbademo.services.ICustomerService;

@RestController
@RequestMapping("/customer")
public class ICustomerController {
	@Autowired
	ICustomerService icustomerService;
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return icustomerService.viewCustomer(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteCustomerById(@PathVariable int id) {
		icustomerService.deleteCustomer(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer addCustomer(@RequestBody Customer customer) {
		return icustomerService.addCustomer(customer);
	}
	
	@PutMapping
	public Customer updateMovie(@RequestBody Customer customer) {
		return icustomerService.updateCustomer(customer);
	}
}
