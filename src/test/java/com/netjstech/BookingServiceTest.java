package com.netjstech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.netjstech.dao.IBookingRepository;
import com.netjstech.entities.TicketBooking;
import com.netjstech.service.IBookingServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BookingServiceTest {

	@Mock
	private IBookingRepository repository;
	
	@InjectMocks
	private IBookingServiceImpl bookingserviceimpl;
	
	
	@Test
	void addticketbooking()
	{
		TicketBooking ticket=new TicketBooking();
		ticket.setTicketid(2);
		ticket.setBookingDate(java.time.LocalDate.parse("2021-09-23"));
		ticket.setShowid(12);
		ticket.setTotalCost(540);
		ticket.setTransactionMode("MobileBankingPayment");
		ticket.setTransactionStatus("Not Successfully");
		ticket.setTransactionid(2000);
		when(repository.save(ticket)).thenReturn(ticket);
		
		TicketBooking savedticket=bookingserviceimpl.addBooking(ticket);
		assertThat(savedticket).isNotNull();
		assertEquals("Not Successfully",savedticket.getTransactionStatus());
	}
//	@Test
//	void showallbookingByshowid(int movieId)
//	{
//		List<TicketBooking>ticketlist=new ArrayList<>();
//		TicketBooking ticket1=new TicketBooking();
//		ticket1.setShowid(12);
//		ticketlist.add(ticket1);
//		
//		when(repository.findAll()).thenReturn(ticketlist);
//		List<TicketBooking>list=bookingserviceimpl.showAllBookingById(movieId);
//		assertEquals(1,list.size());
//		
//	}
	@Test
	void showallbooking()
	{
		List<TicketBooking>ticketlist=new ArrayList<>();
		TicketBooking ticket1=new TicketBooking();
		ticket1.setShowid(0);
	}
}
