package com.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.booking.dao.ISeatRepository;
import com.booking.entities.Seat;

public class ISeatServiceImpl implements ISeatService {

	@Autowired
	private ISeatRepository repository;
	@Override
	public Seat bookSeat(Seat seat) {
		return repository.save(seat);
		
	
		
		// TODO Auto-generated method stub		
	}

	@Override
	public Seat cancelSeatBooking(Seat seat) {
	
		// TODO Auto-generated method stub
		Optional<Seat>optional=repository.findById(seat.getseatId());
		if(optional.isPresent())
		{
			repository.delete(seat);
		}
		return optional.get(); 	
	}

	@Override
	public Seat blockSeat(Seat seat) {
		return seat;
		// TODO Auto-generated method stub
	}
}
		

	
