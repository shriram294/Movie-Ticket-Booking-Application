package com.netjstech.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.netjstech.entities.Customer;
import com.netjstech.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class ICustomerController {

	@Autowired
	ICustomerService CustomerService;
	
	@PostMapping("/customer")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		Customer cus=CustomerService.addCustomer(customer);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{custid}")
				.buildAndExpand(cus.getCustomerId())
				.toUri();
		return ResponseEntity.created(location).body(cus);
	}
	@PutMapping("/customer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer)
	{
		
		Customer cus=CustomerService.updateCustomer(customer);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{custid}")
				.buildAndExpand(cus.getCustomerId())
				.toUri();
		return ResponseEntity.created(location).body(cus);
	}
	@DeleteMapping("/customer")
	@ResponseStatus(HttpStatus.OK)
	public Customer deleteCustomer(@RequestBody Customer customer)
	{
		return CustomerService.deleteCustomer(customer);
		
	}
	@GetMapping("/{custId}")
	public Customer viewCustomer(@PathVariable int custId)
	{
		return CustomerService.viewCustomer(custId);
	}
	@GetMapping
	public List<Customer> viewAllCustomersById(int custId)
	{
		return CustomerService.viewAllCustomersById(custId);
	}
}
