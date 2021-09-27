package com.mtbademo.services;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbademo.dao.IShowRepository;
import com.mtbademo.entities.Show;

@Service
public class IShowServiceImpl implements IShowService{
	@Autowired
	IShowRepository showRepository;
	@Override
	public Show addShow(Show show) {
		return showRepository.save(show);
	}

	@Override
	public Show updateShow(Show show) {
		// TODO Auto-generated method stub
		Show show1 = showRepository.findById(show.getShowId()).orElseThrow(
				()->new EntityNotFoundException("No Show found for the given ID"));
		show1.setShowName(show.getShowName());
		return showRepository.save(show1);
	}

	@Override
	public void removeShow(int showId) {
		// TODO Auto-generated method stub
		showRepository.deleteById(showId);
	}

	@Override
	public Show viewShow(int showId) {
		// TODO Auto-generated method stub
		return showRepository.getById(showId);
	}

	@Override
	public List<Show> viewShowList(int theatreId) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//public List<Show> ViewShowListById(int theatreId) {
		// TODO Auto-generated method stub
		//return (List<Show>) showRepository.findAllById(theatreId);
	//}

	//@Override
	//public List<Show> viewShowListByDate(LocalDate date) {
		// TODO Auto-generated method stub
		//return (List<Show>) showRepository.findAllByDate(date);
	//}

	@Override
	public List<Show> viewAllShows() {
		// TODO Auto-generated method stub
		return showRepository.findAll();
	}

}
