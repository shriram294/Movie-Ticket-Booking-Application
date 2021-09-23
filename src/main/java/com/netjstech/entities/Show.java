package com.netjstech.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="show")
public class Show {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="show_id")
	private int showId;
	
	@Column(name="show_starttime")
	private LocalDateTime showStartTime;
	
	@Column(name="show_endtime")
	private LocalDateTime showEndTime;
	
	@Column(name="show_name")
	private String showName;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Movie movie;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="screen_id")
	private Screen screen;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="theatre_id")
	private Theatre theatre;

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Show show;
	
	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}

	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	
}
