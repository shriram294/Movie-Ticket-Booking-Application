package com.netjstech.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//Creating a table for the customer
@Table(name="customer_master")
public class Customer {

	//Generating id for the primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "customer_id")
	private int CustomerId;
	@Column(name= "customer_name")
	private String CustomerName;
	@Column(name= "address")
	private String Address;
	@Column(name= "mobile_number")
	private String mobileNumber;
	@Column(name= "password")
	private String Password;
	
	@Column(name= "email_id",unique=true)
	private String email;
	
	//using mapping of onetomany annotation
	@OneToMany(targetEntity=TicketBooking.class, mappedBy="customer",cascade=CascadeType.ALL, fetch = FetchType.LAZY)    
	private List<TicketBooking> ticketBookings = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	
	
	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@JsonIgnore
	public List<TicketBooking> getTicketBookings() {
		return ticketBookings;
	}

	public void setTicketBookings(List<TicketBooking> ticketBookings) {
		this.ticketBookings = ticketBookings;
	}
	@JsonIgnore
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
