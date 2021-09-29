package com.netjstech.entities;

import javax.persistence.CascadeType;
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

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seatid;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Seat seat;
	
	@Column(name="seat_number")
	private int seatnumber;
	
	@Column(name="type")
	private String type;
	
	@Column(name="price")
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
	
