package com.rimair.app.rimair.Restservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rimair.app.rimair.metier.ReservationMetier;
import com.rimair.app.rimair.models.Reservation;

@RestController
public class ReservationServices {
    @Autowired
    ReservationMetier reservationMetiermetier ;
    @RequestMapping(value  = "/reservations" , method = RequestMethod.POST)
    public void saveReservation(@RequestBody Reservation reservation) {
        reservationMetiermetier.saveReservation(reservation);
    }
    @RequestMapping(value  = "/reservations/{id}" , method = RequestMethod.GET)
    public Optional<Reservation> getReservation(@PathVariable Long id) {
        return reservationMetiermetier.getReservation(id);
    }
    @RequestMapping(value  = "/reservations/{id}" , method = RequestMethod.DELETE)
    public void cancelReservation(@PathVariable Long id) {
        reservationMetiermetier.cancelReservation(id);
    }
    @RequestMapping(value  = "/reservations/{id}" , method = RequestMethod.PUT)
    public void updateReservation(@RequestBody Reservation reservation, @PathVariable Long id) {
        reservationMetiermetier.updateReservation(reservation, id);
    }
    @RequestMapping(value  = "/reservations" , method = RequestMethod.GET)
    public List<Reservation> reservations() {
        return reservationMetiermetier.reservations();
    }
    
    
}
