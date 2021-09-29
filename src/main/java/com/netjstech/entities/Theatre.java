package com.netjstech.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="theatre")
public class Theatre {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="theatre_id")
	private int theatreId;
	
	@Column(name="theatre_name")
	private String theatreName;
	
	@Column(name="theatre_city")
	private String theatreCity;
	
	@Column(name="manager_name")
	private String managerName;
	
	@Column(name="manager_contact")
	private int managerContact;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "movie", referencedColumnName = "theatre_id")
	List<Movie> listOfMovies = new ArrayList<Movie>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "theatre", referencedColumnName = "theatre_id")
	List<Screen> listOfScreens = new ArrayList<Screen>();
	
	

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(int managerContact) {
		this.managerContact = managerContact;
	}

	public List<Movie> getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(List<Movie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}

	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	

	
}
