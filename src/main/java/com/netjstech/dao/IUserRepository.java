package com.netjstech.dao;

	import org.springframework.data.jpa.repository.JpaRepository;
	
	import com.netjstech.entities.User;
	
	public interface IUserRepository extends JpaRepository<User,Integer>{
	
		
		
	}