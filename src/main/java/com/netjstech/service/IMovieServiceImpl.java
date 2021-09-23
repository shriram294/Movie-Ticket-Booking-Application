package com.netjstech.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netjstech.dao.IMovieRepository;
import com.netjstech.entities.Movie;
import com.netjstech.entities.Show;


@Service
public class IMovieServiceImpl implements IMovieService {

	@Autowired
	private IMovieRepository repository;
	@Override
	public Movie addMovie(Movie movie) {
		
		return repository.save(movie);
		// TODO Auto-generated method stub
			
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		
		Movie m=repository.findById(movie.getMovieid()).orElseThrow(
				()->new EntityNotFoundException("No Movie found here!"));
			m.setMoviegenre(movie.getMoviegenre());
			return repository.save(m);
	}
	@Override
	public Movie removeMovie(int movieid) {
			// TODO Auto-generated method stub
		Optional<Movie>optional=repository.findById(movieid);
		if(optional.isPresent())
		{
			repository.deleteById(movieid);
		}
		return optional.get();
	}
	@Override
	public List<Movie> viewMovieList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> viewMovieList(int theatreid) {
		// TODO Auto-generated method stub
		return (List<Movie>) repository.findById(theatreid).get();
	}

	@Override
	public List<Movie> viewMovieList(LocalDate date) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
