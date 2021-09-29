package com.netjstech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netjstech.entities.Seat;


@Repository
public interface ISeatRepository extends JpaRepository<Seat,Integer>{

}
