package com.booking.service;

import com.booking.entities.Seat;

public interface ISeatService {
	public void bookSeat(Seat seat);
	public void cancelSeatBooking(Seat seat);
	public void blockSeat(Seat seat);
	
}
