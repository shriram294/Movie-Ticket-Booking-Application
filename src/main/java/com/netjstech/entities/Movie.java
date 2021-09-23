package com.netjstech.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name="movie")
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="movie_id")
	private int movieid;
	
	@Column(name="movie_name")
	private String moviename;
	
	
	@Column(name="movie_genre")
	private String moviegenre;
	
	@Column(name="movie_hours")
	private String movieHours;
	
	@Column(name="movie_language")
	private String movieLanguage;
	
	@Column(name="movie_description")
	private String movieDescription;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Movie movie;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Show show;

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getMoviegenre() {
		return moviegenre;
	}

	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;
	}

	public String getMovieHours() {
		return movieHours;
	}

	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	
	
}
