package com.netjstech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.netjstech.dao.ISeatRepository;
import com.netjstech.entities.Seat;
import com.netjstech.service.ISeatServiceImpl;


@ExtendWith(MockitoExtension.class)
class SeatServiceTest {

	@Mock
	private ISeatRepository repository;
	@InjectMocks
	private ISeatServiceImpl seatserviceimpl;
	
//	@Test
//	void addSeatTest()
//	{
//		Seat seat=new Seat(1,10,"VIP",200);
//		
//		when(repository.save(seat)).thenReturn(seat);
//		
//		Seat savedseat=seatserviceimpl.bookSeat(seat);
//		assertThat(savedseat).isNotNull();
//		assertEquals("VIP",savedseat.getType());
//	}
}
