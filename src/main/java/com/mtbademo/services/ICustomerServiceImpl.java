package com.mtbademo.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbademo.dao.ICustomerRepository;
import com.mtbademo.entities.Customer;

@Service
public class ICustomerServiceImpl implements ICustomerService{
	@Autowired
	ICustomerRepository icustomerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return icustomerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer customer1 = icustomerRepository.findById(customer.getCustomerId()).orElseThrow(
				() -> new EntityNotFoundException("No customer Found for the given Id"));
		customer1.setCustomerName(customer.getCustomerName());
		customer1.setAddress(customer.getAddress());
		return icustomerRepository.save(customer1);
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		icustomerRepository.deleteById(customerId);
	}

	@Override
	public Customer viewCustomer(int customerId) {
		// TODO Auto-generated method stub
		return icustomerRepository.getById(customerId);
	}

	//@Override
	//public List<Customer> viewAllCustomers(int movieId) {
		// TODO Auto-generated method stub
		//return icustomerRepository.findAllById(movieId);
	//}

}
