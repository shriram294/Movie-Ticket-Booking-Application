package com.booking.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.booking.entities.Ticket;
import com.booking.entities.TicketBooking;
import com.booking.service.IBookingService;

@RestController
@RequestMapping("/ticket")
public class IBookingController {
	@Autowired
	IBookingService bookingservice;
	
	@GetMapping("/{id}")
	public Ticket getTicketById(@PathVariable int id) {
		return IBookingService.addBooking(int id);
	}
	
	@GetMapping
	public List<TicketBooking> getTicketBookingList(){
		int showId;
		return IBookingService.showBookingListById(int showId);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void cancelBookingById(@PathVariable TicketBooking booking) {
		IBookingService.cancelBooking(TicketBooking booking);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TicketBooking addBooking(@RequestBody int id) {
		return IBookingService.addBooking(int id);
	}
	
	@PutMapping
	public TicketBooking updateBooking(@RequestBody TicketBooking ticketbooking) {
		return IBookingService.updateBooking(Ticketbooking booking);
	}
}
