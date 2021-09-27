package com.mtbademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtbademo.entities.Seat;


public interface ISeatRepository extends JpaRepository<Seat, Integer>{

}
