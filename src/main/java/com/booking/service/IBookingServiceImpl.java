package com.booking.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.booking.dao.IBookingRepository;
import com.booking.entities.Ticket;
import com.booking.entities.TicketBooking;

public class IBookingServiceImpl implements IBookingService {
	@Autowired
	private IBookingRepository repository;
	@Override
	public TicketBooking addBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		return repository.save(booking);		
	}

	@Override
	public TicketBooking updateBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		TicketBooking t=repository.findById(booking.getticketid()).orElseThrow(
				()->new EntityNotFoundException("No Ticket found "));
			return repository.save(t); }
	
@Override
	public TicketBooking cancelBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		Optional<TicketBooking>optional=Optional.empty();
		if(optional.isPresent())
		{
			repository.delete(booking);
		}
		return optional.get();
	}	
	@Override
	public List<TicketBooking> showAllBookingById(int movieId) {
		// TODO Auto-generated method stub
		return (List<TicketBooking>) repository.findById(movieId).get();
	}

	@Override
	public List<TicketBooking> showAllBookingByDate(LocalDate date) {
		return repository.findAll();
		// TODO Auto-generated method stub
	}

	@Override
	public List<TicketBooking> showBookingListById(int showId) {
		// TODO Auto-generated method stub
		return (List<TicketBooking>) repository.findById(showId).get();
	}

	@Override
	public TicketBooking calculateTotalCost(int booking) {
		return null;
		// TODO Auto-generated method stub
		
		
	}

		}
	



