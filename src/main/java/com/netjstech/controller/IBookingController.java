package com.netjstech.controller;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.netjstech.entities.Ticket;
import com.netjstech.entities.TicketBooking;
import com.netjstech.service.IBookingService;

@RestController
@RequestMapping("/ticket")
public class IBookingController {

	@Autowired
	IBookingService IBookingService;
	
	@PostMapping("/ticket")
	//we can set the status code of an HTTP response
	//If it used to show the status in the body
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<TicketBooking>addBooking(@RequestBody TicketBooking ticketbooking)
	{
		TicketBooking book=IBookingService.addBooking(ticketbooking);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
						.path("{ticketid}")
						.buildAndExpand(book.getTicketid())
						.toUri();
		return ResponseEntity.created(location).body(book);
	}
	@PutMapping
	public TicketBooking updateBooking(TicketBooking booking)
	{
		return IBookingService.updateBooking(booking);
		
	}
	@DeleteMapping("/ticket")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<TicketBooking> cancelBooking(TicketBooking booking)
	{
		TicketBooking book=IBookingService.cancelBooking(booking);
		if(book==null)
		{
			return new ResponseEntity<TicketBooking>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<TicketBooking>(HttpStatus.OK);
		}
	}
	@GetMapping("/Booking/{showid}")
	public List<TicketBooking> showAllBookingById(@PathVariable int showid)
	{
		return IBookingService.showAllBookingById(showid);
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<TicketBooking> showAllBookingByDate(@RequestParam(name ="date")
	@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date){
		return IBookingService.showAllBookingByDate(date);
	}
	@GetMapping("/Booking")
	public List<TicketBooking> showBookingListById(int showid)
	{
		return IBookingService.showBookingListById(showid);
	}
//	@GetMapping
//	public double calculateTotalCost(int bookingid)
//	{
//		return IBookingService.calculateTotalCost(bookingid);
//	}
}
