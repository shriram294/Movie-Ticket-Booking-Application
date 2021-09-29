package com.netjstech.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//creating a admin table in the database
@Table(name="admin_master")
public class Admin {

	//Generating Id for the primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "admin_id")
	private int adminId;
	@Column(name= "admin_name")
	private String adminName;
	@Column(name= "admin_contact")
	private String adminContact;
	
	//Mapping type of one to one is used here to  user
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private User user;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	
}
