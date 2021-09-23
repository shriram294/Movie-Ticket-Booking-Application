package com.booking.entities;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name="ticket_master")
public class Ticket {
	private int ticketid;
	
	@Column(name="NoOfSeats")
	private int NoOfSeats;
	
	@Column(name="Seatnumber")
	List Seatnumber = (List) new ArrayList<String>(); 
	
	@Column(name="bookingRef")
	private TicketBooking bookingRef;
	
	@Column(name="ticketStatus")
	private boolean ticketStatus;
	
	public int getticketid() {
		return ticketid;
	}
	public void setticketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getNoOfSeats() {
		return NoOfSeats;
	}
	public void setNoOfSeats(int NoOfSeats) {
		this.NoOfSeats = NoOfSeats;
	}
	public List getSeatnumber() {
		return Seatnumber;
	}
	public void setSeatnumber(List Seatnumber) {
		this.Seatnumber = Seatnumber;
	}
	public TicketBooking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(TicketBooking BookingRef) {
		this.bookingRef = bookingRef;
	}
	public boolean getticketStatus(){
		return ticketStatus;
	}
	public void setticketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
}
	
	
	
	