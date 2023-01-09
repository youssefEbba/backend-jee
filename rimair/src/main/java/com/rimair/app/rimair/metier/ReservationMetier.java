package com.rimair.app.rimair.metier;

import java.util.List;
import java.util.Optional;

import com.rimair.app.rimair.models.Reservation;

public interface ReservationMetier {
    void saveReservation( Reservation reservation);
    Optional<Reservation> getReservation(Long id);
    void cancelReservation(Long id);
    void updateReservation(Reservation reservation ,Long id);
    List<Reservation> reservations();
}
