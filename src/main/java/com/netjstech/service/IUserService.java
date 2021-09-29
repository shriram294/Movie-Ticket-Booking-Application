package com.netjstech.service;

import org.springframework.http.ResponseEntity;


import com.netjstech.entities.User;

public interface IUserService {

	public User addNewUser(User user);
	public User signIn(User user);
	public User signOut(User user);
}
