package com.mtbademo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mtbademo.entities.TicketBooking;
import com.mtbademo.services.IBookingService;

@RestController
@RequestMapping("/booking")
public class IBookingController {
	@Autowired
	IBookingService ibookingService;
	
	//@GetMapping("/{id}")
	//public List<TicketBooking> getAllBookingById(@PathVariable int id) {
		//return ibookingService.showAllBookingById(id);
	//}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TicketBooking addbooking(@RequestBody TicketBooking booking) {
		return ibookingService.addBooking(booking);
	}
	
	@PutMapping
	public TicketBooking updateBooking(@RequestBody TicketBooking booking) {
		return ibookingService.updateBooking(booking);
	}
}
