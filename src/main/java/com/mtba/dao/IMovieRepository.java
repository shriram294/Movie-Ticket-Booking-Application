package com.mtba.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtba.entities.Movie;

public interface IMovieRepository extends JpaRepository<Movie, Integer>{

	//List<Movie> findAllById(int theatreId);

	//List<Movie> findAllByDate(LocalDate date);
}
