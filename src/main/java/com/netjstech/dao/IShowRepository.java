package com.netjstech.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.netjstech.entities.Show;

@Repository
public interface IShowRepository extends JpaRepository<Show,Integer>{

	@Query("SELECT u from Show u where u.theatreid=:theatreid")
	public List<Show> viewShowList(@Param(value = "theatreid")int theatreid);
	
	
	@Query("SELECT u from Show u where u.showStartTime=:showStartTime")
	public List<Show> viewallList(@Param(value="showStartTime")LocalDateTime date);
}
