package com.netjstech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.netjstech.dao.IMovieRepository;
import com.netjstech.entities.Movie;
import com.netjstech.service.IMovieService;
import com.netjstech.service.IMovieServiceImpl;

@ExtendWith(MockitoExtension.class)
public class MovieServiceTest {
	//mocking the repository
	@Mock
	private IMovieRepository movieRepository;
	
	
	//injecting the methods using Impl
	@InjectMocks
	private IMovieServiceImpl movieserviceimpl;
	
	
	
	@Test
	//Testing the addmovie method using assertclass
	void addMovies()
	{
		Movie m=new Movie();
		m.setMovieid(1);
		m.setMovieDescription("A Brave person");
		m.setMovieHours("3");
		m.setMovieLanguage("tamil");
		m.setMoviegenre("action");
		m.setMoviename("Bahubali");
		
		when(movieRepository.save(m)).thenReturn(m);
		Movie savedmovie=movieserviceimpl.addMovie(m);
		assertThat(savedmovie).isNotNull();
		assertEquals("Bahubali",savedmovie.getMoviename());
	}
	
	@Test
	//Testing by getting allmovies using assertclass
	void getallMovies()
	{
		List<Movie>list=new ArrayList<>();
		Movie movie1=new Movie();
		movie1.setMovieDescription("A Brave person");
		movie1.setMovieHours("3");
		movie1.setMovieLanguage("tamil");
		movie1.setMoviegenre("action");
		movie1.setMoviename("Bahubali");
		list.add(movie1);
		
		when(movieRepository.findAll()).thenReturn(list);
		List<Movie>movielist=movieserviceimpl.viewMovieList();
		assertEquals(1,movielist.size());
	}
	@Test
	//Testing by getting moviesbyid using assertclass
	void getMoviesByid()
	{
		List<Movie>list=new ArrayList<>();
		Movie m=new Movie();
		m.setMovieid(1);
		list.add(m);
		when(movieRepository.findAll()).thenReturn(list);
		List<Movie>movielist=movieserviceimpl.viewMovieList();
		assertEquals(1,movielist.size());
	}
	
}
