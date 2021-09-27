package com.mtbademo.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtbademo.entities.Show;

public interface IShowRepository extends JpaRepository<Show, Integer>{

	//List<Show> findAllById(int theatreId);

	//List<Show> findAllByDate(LocalDate date);

}
