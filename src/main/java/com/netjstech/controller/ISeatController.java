package com.netjstech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netjstech.entities.Seat;
import com.netjstech.service.ISeatService;

@RestController
@RequestMapping("/seat")
public class ISeatController {

	@Autowired
	ISeatService seatService;
	
	@PostMapping
	public Seat bookSeat(@RequestBody Seat seat)
	{
		return seatService.bookSeat(seat);
	}
	@DeleteMapping
	public Seat cancelSeatBooking(@RequestBody Seat seat)
	{
		System.out.println("Deleted success");
		return seatService.cancelSeatBooking(seat);	
	}
	@PutMapping
	public Seat blockSeat(@RequestBody Seat seat)
	{
		return seatService.blockSeat(seat);
	}
}
