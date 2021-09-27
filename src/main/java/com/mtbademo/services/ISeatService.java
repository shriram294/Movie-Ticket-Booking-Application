package com.mtbademo.services;

import com.mtbademo.entities.Seat;

public interface ISeatService {
	public Seat bookSeat(Seat seat);
	public Seat CancelSeatBooking(Seat seat);
	public Seat blockSeat(Seat seat);
}
