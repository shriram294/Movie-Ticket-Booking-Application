package com.booking.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticketbooking_master")
public class TicketBooking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticketid")
	private int ticketid;
	@Column(name="showid")
	private int showid;
	@Column(name="bookingDate")
	private LocalDate bookingDate;
	@Column(name="transactionid")
	private int transactionid;
	@Column(name="transactionMode")
	private String transactionMode;
	@Column(name="transactionStatus")
	private String transactionStatus;
	@Column(name="totalCost")
	private double totalCost;
	@Column(name="ticket")
	private Ticket ticket;
	
	
	public int getticketid() {
		return ticketid;
	}
	public void setticketid(int ticketid) {
		this.ticketid = ticketid;
	}
	
	public int getshowid() {
		return showid;
	}
	public void setshowid(int showid) {
		this.showid = showid;
	}
	public LocalDate getbookingDate() {
		return bookingDate;
	}
	public void setbookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int gettransactionid() {
		return transactionid;
	}
	public void settransactionid(int transactionid) {
		this.transactionid = transactionid;
	}	
	public String gettransactionMode() {
		return transactionMode;
	}
	public void settransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}
	public String gettransactionStatus(){
		return transactionStatus;
	}
	public void settransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public double gettotalCost() {
		return totalCost;	
	}
	public void settotalCost(double totalCost) {
		this.totalCost=totalCost;
	}
	public Ticket ticket() {
		return ticket;
	}
	public void setticket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
}
	
	
	
	
