package com.rimair.app.rimair.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rimair.app.rimair.models.Reservation;

public interface ReservationRepository extends JpaRepository <Reservation,Long> {
    
}
