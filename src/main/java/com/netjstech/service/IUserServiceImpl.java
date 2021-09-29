package com.netjstech.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.netjstech.dao.IUserRepository;
import com.netjstech.entities.User;


@Service
public class IUserServiceImpl implements IUserService
{
	@Autowired
	IUserRepository repository;

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public User signIn(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signOut(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

