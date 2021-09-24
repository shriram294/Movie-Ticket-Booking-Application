package com.netjstech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netjstech.dao.IUserRepository;
import com.netjstech.entities.User;


@Service
public class IUserServiceImpl implements IUserService {
			
			@Autowired
			private IUserRepository repository;
			
			@Override
			public User addNewUser(User user) {
				// TODO Auto-generated method stub
				return repository.save(user);
				
			}
			
			@Override
			public User signIn(User user) {
				// TODO Auto-generated method stub
				return repository.save(user);
				
			}
			
			@Override
			public User signOut(User user) {
				// TODO Auto-generated method stub
				return repository.save(user);
				
			}
			
			
			
					
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
