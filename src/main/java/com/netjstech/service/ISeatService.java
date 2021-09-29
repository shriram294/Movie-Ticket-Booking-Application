package com.netjstech.service;

import com.netjstech.entities.Seat;

public interface ISeatService {

	public Seat bookSeat(Seat seat);
	public Seat cancelSeatBooking(Seat seat);
	public Seat blockSeat(Seat seat);
}
