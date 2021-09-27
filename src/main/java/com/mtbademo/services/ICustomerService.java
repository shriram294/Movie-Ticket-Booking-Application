package com.mtbademo.services;

import java.util.List;

import com.mtbademo.entities.Customer;
public interface ICustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(int id);
	public Customer viewCustomer(int customer_id);
	//public List<Customer> viewAllCustomers(int movieId);
}
