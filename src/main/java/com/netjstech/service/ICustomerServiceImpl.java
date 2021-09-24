package com.netjstech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.netjstech.dao.ICustomerRepository;
import com.netjstech.entities.Customer;


public class ICustomerServiceImpl implements ICustomerService{
	
	    @Autowired
		private ICustomerRepository repository;
		@Override
		public Customer addCustomer(Customer customer) {
			// TODO Auto-generated method stub
			return repository.save(customer);		
		}

		@Override
		public Customer updateCustomer(Customer customer) {
			// TODO Auto-generated method stub
			Customer c=repository.findById(customer.getCustomerId()).orElseThrow(
					()->new EntityNotFoundException("No Customer found "));
				return repository.save(c); }
		
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
		public Customer viewCustomer(int custid) {
			// TODO Auto-generated method stub
			return (Customer) repository.findById(custid).get();
		}
		
		
		@Override
		public List<Customer> viewAllCustomersById(int movieId) {
			// TODO Auto-generated method stub
			return (List<Customer>) repository.findById(movieId).get();
		}
		
}	
		
		
		
		
		


		