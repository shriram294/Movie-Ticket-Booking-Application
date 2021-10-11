package com.netjstech.controller;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.netjstech.entities.Show;
import com.netjstech.service.IShowService;

@RestController
@RequestMapping("/show")
public class IShowController {

	@Autowired
	IShowService showService;
	
	@PostMapping("/{show}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Show> addShow(@RequestBody Show show)
	{
		Show s=showService.addShow(show);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest()
				.path("{showid}")
				.buildAndExpand(s.getShowId())
				.toUri();
		return ResponseEntity.created(location).body(s);
		
	}
	
	@PutMapping
	public Show updateShow(@RequestBody Show show)
	{
		return showService.updateShow(show);
	}
	@DeleteMapping("/show")
	public Show removeShow(@RequestBody Show show)
	{
		return showService.removeShow(show);		
	}
	@GetMapping
	public List<Show>viewList(){
		return showService.viewAllshows();
	}
	@GetMapping("/show")
	public List<Show>viewShowList(int theatreid)
	{
		return showService.viewShowList(theatreid);
	}
	@GetMapping("/show/{date}")
	public List<Show>viewallList(@RequestParam(name ="date")
	@DateTimeFormat(pattern = "yyyy-MM-dd-HH-mm-ss")@PathVariable LocalDateTime date)
	{
		return showService.viewallList(date);
		
	}
	
}
