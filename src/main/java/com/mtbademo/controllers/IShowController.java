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

import com.mtbademo.entities.Show;
import com.mtbademo.services.IShowService;

@RestController
@RequestMapping("/show")
public class IShowController {
	@Autowired
	IShowService showService;
	
	@GetMapping("/{id}")
	public Show getMovieById(@PathVariable int id) {
		return showService.viewShow(id);
	}
	
	@GetMapping
	public List<Show> getShowList(){
		return showService.viewAllShows();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteShowById(@PathVariable int id) {
		showService.removeShow(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Show addShow(@RequestBody Show show) {
		return showService.addShow(show);
	}
	
	@PutMapping
	public Show updateMovie(@RequestBody Show show) {
		return showService.updateShow(show);
	}
}
