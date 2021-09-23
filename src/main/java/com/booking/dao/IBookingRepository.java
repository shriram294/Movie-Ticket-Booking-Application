package com.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.booking.entities.Seat;

public interface IBookingRepository extends JpaRepository<Seat, Integer> {

}
