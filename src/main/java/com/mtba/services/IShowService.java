package com.mtba.services;

import java.time.LocalDate;
import java.util.List;

import com.mtba.entities.Show;


public interface IShowService {
	public Show addShow(Show show);
	public Show updateShow(Show show);
	public void removeShow(int showId);
	public Show viewShow(int showId);
	public List<Show> viewShowList(int theatreId);
	//public List<Show> ViewShowListById(int theatreId);
	//public List<Show> viewShowListByDate(LocalDate date);
	public List<Show> viewAllShows();
}
