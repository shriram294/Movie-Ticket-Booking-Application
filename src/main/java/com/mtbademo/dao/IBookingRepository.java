package com.mtbademo.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtbademo.entities.TicketBooking;
public interface IBookingRepository extends JpaRepository<TicketBooking, Integer>{

	//public TicketBooking cancelBooking(TicketBooking booking);

	//public List<TicketBooking> findAllById(int movieId);

	//public List<TicketBooking> findAllByDate(LocalDate date);

}
