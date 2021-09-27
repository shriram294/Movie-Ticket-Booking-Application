package com.mtbademo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtbademo.entities.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	//public List<Customer> findAllById(int movieId);

}
