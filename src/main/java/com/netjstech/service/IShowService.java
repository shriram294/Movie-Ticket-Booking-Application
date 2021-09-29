package com.netjstech.service;

import java.time.LocalDateTime;
import java.util.List;

import com.netjstech.entities.Show;

public interface IShowService {

	public Show addShow(Show show);
	public Show updateShow(Show show);
	public Show removeShow(Show show);
	public Show viewShow(Show show);
	public List<Show>viewShowList(int theatreId);
	public List<Show>viewallList(LocalDateTime date);
	public List<Show>viewAllshows();
	
	
}
