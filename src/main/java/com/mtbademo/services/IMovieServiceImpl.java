package com.mtbademo.services;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mtbademo.dao.IMovieRepository;
import com.mtbademo.entities.Movie;

@Service
@Transactional(readOnly = true)
public class IMovieServiceImpl implements IMovieService{
	@Autowired
	IMovieRepository imovieRepository;
	
	@Override
	@Transactional
	public Movie addMovie(Movie movie) {
		return imovieRepository.save(movie);
	}

	@Override
	@Transactional
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		Movie movie1 = imovieRepository.findById(movie.getMovieId()).orElseThrow(
				()->new EntityNotFoundException("No Movie found for the given ID"));
		movie1.setMovieName(movie.getMovieName());
		return imovieRepository.save(movie1);
	}

	@Override
	@Transactional
	public void removeMovie(int movieId) {
		// TODO Auto-generated method stub
		imovieRepository.deleteById(movieId);
	}

	@Override
	public Movie viewMovie(int movieId) {
		// TODO Auto-generated method stub
		return imovieRepository.getById(movieId);
	}

	@Override
	public List<Movie> viewMovieList() {
		// TODO Auto-generated method stub
		return imovieRepository.findAll();
	}

	//@Override
	//public List<Movie> ViewMovieListById(int theatreId) {
		// TODO Auto-generated method stub
		//return (List<Movie>) imovieRepository.findAllById(theatreId);
	//}

	//@Override
	//public List<Movie> viewMovieListByDate(LocalDate date) {
		// TODO Auto-generated method stub
		//return (List<Movie>) imovieRepository.findAllByDate(date);
	//}

}
