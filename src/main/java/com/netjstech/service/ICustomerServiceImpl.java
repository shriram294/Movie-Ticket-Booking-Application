package com.netjstech.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netjstech.dao.ICustomerRepository;
import com.netjstech.entities.Customer;

@Service
public class ICustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepository repository;
	
	@Override
	//ADD CUSTOMER
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	//UPDATING CUSTOMER
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer c=repository.findById(customer.getCustomerId()).orElseThrow(
				()->new EntityNotFoundException("No Customer is Found"));
		c.setCustomerName(customer.getCustomerName());
		return repository.save(c);
	}

	@Override
	//DELETE CUSTOMER
	public Customer deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Optional<Customer>optional=repository.findById(customer.getCustomerId());
		if(optional.isPresent())
		{
			 repository.delete(customer);
		}
		return optional.get();
	}

	@Override
	//VIEW CUSTOMER
	public Customer viewCustomer(int custId) {
		// TODO Auto-generated method stub
		return repository.findById(custId).get();
	}

	@Override
	public List<Customer> viewAllCustomersById(int custId) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
