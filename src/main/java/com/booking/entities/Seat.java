package com.booking.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="seat_master")
public class Seat {
	private int seatid;
	@ManyToOne(cascade = CasadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "ticketid",nullable=false)
	private int seatnumber;
	private String type;
	private double price;

	public int getseatId() {
		return seatid;
	}
	public void setseatId(int seatid) {
		this.seatid = seatid;
	}
	public int getseatnumber() {
		return seatnumber;
	}
	public void setseatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
}
	
	
	
	

