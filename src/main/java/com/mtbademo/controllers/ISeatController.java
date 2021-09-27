package com.mtbademo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mtbademo.entities.Seat;
import com.mtbademo.services.ISeatService;

@RestController
@RequestMapping("/seat")
public class ISeatController {
	@Autowired
	ISeatService iseatService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Seat BookSeat(@RequestBody Seat seat) {
		return iseatService.blockSeat(seat);
	}
	
	
}
