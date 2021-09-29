package com.netjstech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netjstech.dao.IUserRepository;
import com.netjstech.entities.User;
import com.netjstech.service.IUserService;
@RestController
@RequestMapping("/user")
public class IUserController  {

	@Autowired
	IUserService userService;
	
	
	@PostMapping("/user")
	public User addNewUser(@RequestBody User user)
	{
		return userService.addNewUser(user);
	}
	
	
}