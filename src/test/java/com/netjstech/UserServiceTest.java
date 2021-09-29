package com.netjstech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.netjstech.dao.IUserRepository;
import com.netjstech.entities.User;
import com.netjstech.service.IUserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private IUserRepository repository;
	
	@InjectMocks
	private IUserServiceImpl userserviceimpl;
	
//	@Test
//	void addUser()
//	{
//		User u=new User();
//		u.setUserId(4);
//		u.setPassword("vij$%57");
//		u.setRole("customer");
//		when(repository.save(u)).thenReturn(u);
//		
//		User saveduser=userserviceimpl.addNewUser(u);
//		assertThat(saveduser).isNotNull();
//		assertEquals("vij$%57",saveduser.getPassword());
//	}
//	@Test
//	void updateUser()
//	{
//		
//	}
	
}
