package com.netjstech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.netjstech.entities.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie,Integer> {

	@Query("SELECT u FROM Movie u where u.theatre=:theatre")
	public List<Movie> viewMovieList(@Param(value="theatre")int theatreid);
}
