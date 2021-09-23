package com.netjstech.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netjstech.dao.IShowRepository;
import com.netjstech.entities.Show;


@Service
public class IShowServiceImpl implements IShowService {

	@Autowired
	private IShowRepository repository;
	
	@Override
	public Show addShow(Show show) {
		// TODO Auto-generated method stub
		return repository.save(show);
		
	}

	@Override
	public Show updateShow(Show show) {
		// TODO Auto-generated method stub
		Show s=repository.findById(show.getShowId()).orElseThrow(
				()->new EntityNotFoundException("No show Found"));
		s.setShowName(show.getShowName());
		return repository.save(s);
	}

	@Override
	public Show removeShow(Show show) {
		// TODO Auto-generated method stub
		Optional<Show>optional=repository.findById(show.getShowId());
		if(optional.isPresent())
		{
			repository.delete(show);
		}
		return optional.get(); 
	}

	@Override
	public Show viewShow(Show show) {
		// TODO Auto-generated method stub
		Show s= repository.findById(show.getShowId()).get();
		return s;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Show> viewShowList(int theatreid) {
		// TODO Auto-generated method stub
		return (List<Show>) repository.findById(theatreid).get();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Show> viewallList(LocalDateTime date) {
		// TODO Auto-generated method stub
		return (List<Show>) repository.findById(date.getHour()).get();
	}

	@Override
	public List<Show> viewAllshows() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
