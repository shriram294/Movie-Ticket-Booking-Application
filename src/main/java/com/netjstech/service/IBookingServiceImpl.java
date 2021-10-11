package com.netjstech.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netjstech.dao.IBookingRepository;
import com.netjstech.entities.TicketBooking;

@Service
public class IBookingServiceImpl implements IBookingService {

	@Autowired
	private IBookingRepository repository;

	@Override
	//ADD BOOKING
	public TicketBooking addBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		return repository.save(booking);
	}

	@Override
	//UPDATE BOOKING
	public TicketBooking updateBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		
		TicketBooking ticket=repository.findById(booking.getTicketid()).orElseThrow(
				()->new EntityNotFoundException("No ticket booking found"));
		ticket.setTransactionStatus(booking.getTransactionStatus());
		return repository.save(ticket);
				
	}

	@Override
	//CANCEL BOOKING
	public TicketBooking cancelBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		Optional<TicketBooking>optional=repository.findById(booking.getTicketid());
		if(optional.isPresent())
		{
			repository.delete(booking);
		}
		return optional.get();
	}

	@Override
	//SHOW LIST OF BOOKING BY ID
	public List<TicketBooking> showAllBookingById(int movieId) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	//SHOW LIST OF BOOKING BY DATE
	public List<TicketBooking> showAllBookingByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return repository.showAllBookingByDate(date);
	}

	@Override
	//SHOW LIST OF BOOKING BY ID
	public List<TicketBooking> showBookingListById(int showId) {
		// TODO Auto-generated method stub
		return repository.showBookingListById(showId);
	}

//	@Override
//	public double calculateTotalCost(int bookingid) {
//		// TODO Auto-generated method stub
//		return repository.calculateTotalCost(bookingid);
//	}
}
