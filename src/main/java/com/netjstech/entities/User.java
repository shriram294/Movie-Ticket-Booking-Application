package com.netjstech.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user_master")
public class User {

	public static final String ADMIN = "ADMIN";
	public static final String USER="USER";
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "user_id")
	private int userId;
	@Column(name= "user_password")
	private String password;
	@Column(name= "user_role")
	private String role;
	
	
	
	@OneToOne(mappedBy="user",cascade = CascadeType.ALL)
	private Customer customer;
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private Admin admin;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
}
