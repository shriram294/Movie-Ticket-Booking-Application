package com.netjstech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.netjstech.dao.IShowRepository;
import com.netjstech.entities.Show;
import com.netjstech.service.IShowService;
import com.netjstech.service.IShowServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ShowServiceTest {

	//mocking annotation is used for faking
	@Mock
	private IShowRepository repository;
	
	//injects the methods in Impl
	@InjectMocks
	private IShowServiceImpl showserviceImpl;
	
	//Adding the 
	@Test
	void addShowTest()
	{
		Show sh=new Show();
		sh.setShowId(1);
		sh.setShowName("Matinee show");
		sh.setShowStartTime(java.time.LocalDateTime.of(2021, 9, 26, 9, 40, 20, 465));
		sh.setShowEndTime(java.time.LocalDateTime.of(2021,9,26,9,40,20,465));
		sh.setTheatreid(1);
		when(repository.save(sh)).thenReturn(sh);
		
		Show savedshow=showserviceImpl.addShow(sh);
		assertThat(savedshow).isNotNull();
		assertEquals("Matinee show",savedshow.getShowName());
	}
	@Test
	void updateShowTest() 
	{
		Show sh=new Show();
		sh.setShowId(2);
		sh.setShowName("nightshow");
		sh.setShowStartTime(java.time.LocalDateTime.of(2016, 6, 22, 19, 10, 25));
		sh.setShowEndTime(java.time.LocalDateTime.of(2016, 6, 22, 22, 10, 25));
		sh.setTheatreid(2);
		when(repository.save(sh)).thenReturn(sh);
		
		Show savedval=showserviceImpl.updateShow(sh);
		assertThat(savedval).isNotNull();
		assertEquals("nightshow",savedval.getShowName());
	}
	@Test
	void getallshowsTest()
	{
		List<Show>list=new ArrayList<>();
		Show show1=new Show();
		show1.setShowId(1);
		show1.setShowName("Matinee show");
		show1.setShowStartTime(java.time.LocalDateTime.of(2021, 9, 26, 9, 40, 20, 465));
		show1.setShowEndTime(java.time.LocalDateTime.of(2021,9,26,9,40,20,465));
		show1.setTheatreid(1);
		list.add(show1);
		when(repository.findAll()).thenReturn(list);
		List<Show>showlist=showserviceImpl.viewAllshows();
		assertEquals(1,showlist.size());
	}
	@Test
	void deleteshowTest()
	{
		Show sh=new Show();
		sh.setShowId(2);
		repository.delete(sh);
		Show savedshow=showserviceImpl.removeShow(sh);
		assertThat(savedshow).isNotNull();
		
		
	}
	@Test
	void viewshowList()
	{
		List<Show>list=new ArrayList<>();
		Show show1=new Show();
		show1.setTheatreid(2);
		list.add(show1);
		when(repository.findAll()).thenReturn(list);
		List<Show>showlist=showserviceImpl.viewAllshows();
		assertEquals(1,showlist.size());
		
		
	}
	
}
