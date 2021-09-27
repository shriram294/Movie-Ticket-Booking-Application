package com.mtbademo.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbademo.dao.IUserRepository;
import com.mtbademo.entities.User;
@Service
public class IUserServiceImpl implements IUserService{
	@Autowired
	IUserRepository iuserRepository;

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return iuserRepository.save(user);
	}

	@Override
	public User signIn(User user) {
		// TODO Auto-generated method stub
		user = iuserRepository.findById(user.getUserId()).orElseThrow(
				() -> new EntityNotFoundException("No User found for the given ID"));
		return null;
	}

	@Override
	public User signOut(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
