package com.mtbademo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbademo.dao.IBookingRepository;
import com.mtbademo.entities.TicketBooking;
@Service
public class IBookingServiceImpl implements IBookingService{
	@Autowired
	IBookingRepository ibookingRepository;

	@Override
	public TicketBooking addBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		return ibookingRepository.save(booking);
	}

	@Override
	public TicketBooking updateBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		TicketBooking booking1 = ibookingRepository.findById(booking.getTicketId()).orElseThrow(
				() -> new EntityNotFoundException("Ticket Not found For given Id"));
		booking1.setTransactionMode(booking.getTransactionMode());
		booking1.setBookingDate(booking.getBookingDate());
		return ibookingRepository.save(booking1);
	}

	//@Override
	//public TicketBooking cancelBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		//return ibookingRepository.cancelBooking(booking);
	//}

	//@Override
	//public List<TicketBooking> showAllBookingById(int movieId) {
		// TODO Auto-generated method stub
		//return ibookingRepository.findAllById(movieId);
	//}

	//@Override
	//public List<TicketBooking> showAllBookingByDate(LocalDate date) {
		// TODO Auto-generated method stub
		//return ibookingRepository.findAllByDate(date);
	//}

	//@Override
	//public List<TicketBooking> showAllBookingList(int showId) {
		// TODO Auto-generated method stub
		//return ibookingRepository.findAllById(showId);
	//}

	@Override
	public double calculateTotalCost(TicketBooking booking) {
		// TODO Auto-generated method stub
		double totalCost = booking.getTotalCost();
		return totalCost;
	}

}
