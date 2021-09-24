package com.netjstech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.netjstech.entities.User;
import com.netjstech.service.IUserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/User")
public class IUserController {


		@Autowired
		IUserService userService;
		
		@PostMapping("/{user}")
		@ResponseStatus(HttpStatus.CREATED)
		public ResponseEntity<User> addUser(@RequestBody User user)
		{
			User u=userService.addUser(user);
			URI location=ServletUriComponentsBuilder.fromCurrentRequest()
					.path("{userid}")
					.buildAndExpand(u.getUserId())
					.toUri();
			return ResponseEntity.created(location).body(u);
			
		}
		
		
		@PostMapping("/{user}")
		@ResponseStatus(HttpStatus.CREATED)
		public ResponseEntity<User> signIn(@RequestBody User user)
		{
			User u=userService.signIn(user);
			URI location=ServletUriComponentsBuilder.fromCurrentRequest()
					.path("{userid}")
					.buildAndExpand(u.getUserId())
					.toUri();
			return ResponseEntity.created(location).body(u);
			
		}
		
		@PostMapping("/{user}")
		@ResponseStatus(HttpStatus.CREATED)
		public ResponseEntity<User> signOut(@RequestBody User user)
		{
			User u=userService.signOut(user);
			URI location=ServletUriComponentsBuilder.fromCurrentRequest()
					.path("{userid}")
					.buildAndExpand(u.getUserId())
					.toUri();
			return ResponseEntity.created(location).body(u);
			
		}
		
		
		
		
		
		
}
