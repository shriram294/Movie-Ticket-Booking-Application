package com.netjstech.dao;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.netjstech.entities.Customer;

	public interface ICustomerRepository extends JpaRepository<Customer,Integer>{

		
		
	}