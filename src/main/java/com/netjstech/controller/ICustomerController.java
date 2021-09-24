package com.netjstech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.netjstech.entities.Customer;
import com.netjstech.service.ICustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Customer")
public class ICustomerController {



			@Autowired
			ICustomerService customerService;
			
			@PostMapping("/{customer}")
			@ResponseStatus(HttpStatus.CREATED)
			public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
			{
				
				Customer c=customerService.addCustomer(customer);
					URI location=ServletUriComponentsBuilder.fromCurrentRequest()
							.path("{customerid}")
							.buildAndExpand(c.getCustomerId())
							.toUri();
					return ResponseEntity.created(location).body(c);
			
			@PutMapping
			public Customer updateCustomer(@RequestBody Customer customer)
			{
				return customerService.updateCustomer(customer);
			}
			@DeleteMapping("/{Customer}")
			public Customer deleteCustomer(Customer customer)
			{
				return customerService.deleteCustomer(Customer);		
			}
			
			
			@GetMapping
			public List<Customer>viewList(){
				return customerService.viewAllCustomers();
			}
			
			
		
	}

}
