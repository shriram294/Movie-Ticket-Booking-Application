package com.netjstech.service;

import com.netjstech.entities.User;

public interface IUserService {
		  public void addNewUser(User user);
		  public void signIn(User user);
		  public void signOut(User user);
		 

}