package com.mtbademo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mtbademo.entities.Movie;
import com.mtbademo.services.IMovieService;

@RestController
@RequestMapping("/movie")
public class IMovieController {
	@Autowired
	IMovieService imovieService;
	
	@GetMapping("/{id}")
	public Movie getMovieById(@PathVariable int id) {
		return imovieService.viewMovie(id);
	}
	
	@GetMapping
	public List<Movie> getMoviesList(){
		return imovieService.viewMovieList();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteMovieById(@PathVariable int id) {
		imovieService.removeMovie(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Movie addMovie(@RequestBody Movie movie) {
		return imovieService.addMovie(movie);
	}
	
	@PutMapping
	public Movie updateMovie(@RequestBody Movie movie) {
		return imovieService.updateMovie(movie);
	}
}
