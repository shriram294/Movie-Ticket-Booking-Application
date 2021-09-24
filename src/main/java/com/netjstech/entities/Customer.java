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
import javax.persistence.Table;



@Entity
@Table(name="customer_master")
public class Customer {
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

	@OneToMany(targetEntity=TicketBooking.class, mappedBy="Customer",cascade=CascadeType.ALL, fetch = FetchType.LAZY)    
	private List<TicketBooking> ticketBookings = new ArrayList<>();

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
	
}
