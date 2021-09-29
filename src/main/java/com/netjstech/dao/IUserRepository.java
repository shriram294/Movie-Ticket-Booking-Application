package com.netjstech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netjstech.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {

	public User findByUserId(int userId);
	public boolean existsById(int userId);
		// TODO Auto-generated method stu
	
	
}
