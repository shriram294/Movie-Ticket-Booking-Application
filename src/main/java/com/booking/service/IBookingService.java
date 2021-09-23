package com.booking.service;

import java.time.LocalDate;
import java.util.List;

import com.booking.entities.TicketBooking;

public interface IBookingService {
	public TicketBooking addBooking(TicketBooking booking);
	public TicketBooking updateBooking(TicketBooking booking);
	public TicketBooking cancelBooking(TicketBooking booking);
	public List<TicketBooking> showAllBookingById(int movieId);
	public List<TicketBooking> showAllBookingByDate(LocalDate date);
	public List<TicketBooking> showBookingListById(int showId);
	public TicketBooking calculateTotalCost(int bookingid);
	

}
