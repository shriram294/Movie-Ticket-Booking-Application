package com.mtbademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtbademo.entities.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
