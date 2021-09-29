package com.netjstech.service;

import java.util.List;

import com.netjstech.entities.Customer;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public Customer viewCustomer(int custId);
    public List<Customer> viewAllCustomersById(int cusId);
}
