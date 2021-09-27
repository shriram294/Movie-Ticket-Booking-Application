package com.mtbademo.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbademo.dao.ISeatRepository;
import com.mtbademo.entities.Seat;

@Service
public class ISeatServiceImpl implements ISeatService{
	@Autowired
	ISeatRepository iseatRepository;

	@Override
	public Seat bookSeat(Seat seat) {
		// TODO Auto-generated method stub
		return iseatRepository.save(seat);
	}

	@Override
	public Seat CancelSeatBooking(Seat seat) {
		// TODO Auto-generated method stub
		Seat seat1 = iseatRepository.findById(seat.getSeatId()).orElseThrow(
				() -> new EntityNotFoundException("your seat is not booked"));
		seat1.setSeatId(seat.getSeatId());
		return iseatRepository.save(seat1);
	}

	@Override
	public Seat blockSeat(Seat seat) {
		// TODO Auto-generated method stub
		return null;
	}

}
