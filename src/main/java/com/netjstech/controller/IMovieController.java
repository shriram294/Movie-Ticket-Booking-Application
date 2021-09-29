package com.netjstech.controller;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.netjstech.entities.Movie;
import com.netjstech.service.IMovieService;

@RestController
@RequestMapping("/movie")
public class IMovieController {

	@Autowired
	IMovieService movieService;
	
	@PostMapping("/movie")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie)
	{
		Movie mov=movieService.addMovie(movie);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{movieid}")
				.buildAndExpand(mov.getMovieid())
				.toUri();
		return ResponseEntity.created(location).body(mov);
	}
	@PutMapping
	public Movie updateMovie(@RequestBody Movie movie)
	{
		return movieService.updateMovie(movie);
	}
	@DeleteMapping("movie/{movieid}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteMovie(@PathVariable int movieid)
	{
		Movie m=movieService.removeMovie(movieid);
		if(m==null)
		{
			return new ResponseEntity<String>("Movie Successfully deleted",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Problem in deleting",HttpStatus.OK);
		}
	}
	@GetMapping
	public List<Movie>viewMovieList()
	{
		return movieService.viewMovieList();
	}
	@GetMapping("/movie")
	public List<Movie> viewMovieList(int theatreid)
	{
		return movieService.viewMovieList(theatreid);
		
	}
	@GetMapping("movie/{list}")
	public List<Movie>viewMovieList(@PathVariable LocalDate date)
	{
		return movieService.viewMovieList(date);
		
	}
}
