package com.netjstech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netjstech.entities.Movie;

public interface IMovieRepository extends JpaRepository<Movie,Integer> {

	
}
