package com.netjstech.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticket_master")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ticketid;
	
	@Column(name="no_of_seats")
	private int NoOfSeats;
	
	@OneToOne
	private TicketBooking bookingRef;
	
	@Column(name="ticket_status")
	private boolean ticketStatus;
	
	@OneToMany(mappedBy="seat",cascade=CascadeType.ALL)
	private List<Seat>seatnumber;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getNoOfSeats() {
		return NoOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		NoOfSeats = noOfSeats;
	}

	public TicketBooking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(TicketBooking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public List<Seat> getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(List<Seat> seatnumber) {
		this.seatnumber = seatnumber;
	}
	
	
	
}
