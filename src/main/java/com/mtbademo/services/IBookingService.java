package com.mtbademo.services;

import java.time.LocalDate;
import java.util.List;

import com.mtbademo.entities.TicketBooking;

public interface IBookingService {
	public TicketBooking addBooking(TicketBooking booking);
	public TicketBooking updateBooking(TicketBooking booking);
	//public TicketBooking cancelBooking(TicketBooking booking);
	//public List<TicketBooking> showAllBookingById(int movieId);
	//public List<TicketBooking> showAllBookingByDate(LocalDate date);
	//public List<TicketBooking> showAllBookingList(int showId);
	public double calculateTotalCost(TicketBooking booking);
}
