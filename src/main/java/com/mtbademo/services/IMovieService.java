package com.mtbademo.services;

import java.time.LocalDate;
import java.util.List;

import com.mtbademo.entities.Movie;


public interface IMovieService {
	public Movie addMovie(Movie movie);
	public Movie updateMovie(Movie movie);
	public void removeMovie(int movieId);
	public Movie viewMovie(int movieId);
	public List<Movie> viewMovieList();
	//public List<Movie> ViewMovieListById(int theatreId);
	//public List<Movie> viewMovieListByDate(LocalDate date);
}
