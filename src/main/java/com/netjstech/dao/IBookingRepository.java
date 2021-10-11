package com.netjstech.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.netjstech.entities.TicketBooking;

@Repository

public interface IBookingRepository extends JpaRepository<TicketBooking,Integer> {

	@Query("SELECT u from TicketBooking u where u.bookingDate=:bookingDate")
	List<TicketBooking>showAllBookingByDate(@Param(value = "bookingDate")LocalDate date);
	
	@Query("SELECT u from TicketBooking u where u.showid=:showid")
	public List<TicketBooking> showBookingListById(@Param(value="showid")int showid);
	
//	@Query("SELECT u from TicketBooking u where u.totalCost=:totalCost")
//	public double calculateTotalCost(@Param(value="totalCost")int transactionid);
}
