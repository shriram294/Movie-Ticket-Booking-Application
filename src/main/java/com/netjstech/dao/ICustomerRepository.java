package com.netjstech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.netjstech.entities.Customer;

@Repository

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

	@Query("SELECT u from Customer u where u.CustomerId=:CustomerId")
	List<Customer> viewAllCustomersById(@Param(value="CustomerId")int custId);
}
