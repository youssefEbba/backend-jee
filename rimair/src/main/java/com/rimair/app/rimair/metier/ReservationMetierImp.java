package com.rimair.app.rimair.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimair.app.rimair.dao.ReservationRepository;
import com.rimair.app.rimair.dao.VolRepository;
import com.rimair.app.rimair.models.Reservation;
import com.rimair.app.rimair.models.Vol;

@Service
public class ReservationMetierImp implements ReservationMetier {
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    VolRepository volRepository;
    @Override
    public void saveReservation(Reservation reservation) {
        reservationRepository.save(reservation);
        Vol vol = reservation.getVol();
        int nA = vol.getNombreClassA();
        int nB = vol.getNombreClassB();
        if(reservation.getClasseplace()=="A"){
            vol.setNombreClassA(nA-1);            
        }
        else{
            vol.setNombreClassB(nB-1);
        }
        volRepository.save(vol);
    }

    @Override
    public Optional<Reservation> getReservation(Long id) {

        return reservationRepository.findById(id);
    }

    @Override
    public void cancelReservation(Long id) {
        
        Optional<Reservation> reservation = reservationRepository.findById(id);
        Vol vol = reservation.get().getVol();
        int nA = vol.getNombreClassA();
        int nB = vol.getNombreClassB();
        if(reservation.get().getClasseplace()=="A"){
            vol.setNombreClassA(nA+1);            
        }
        else{
            vol.setNombreClassB(nB+1);
        }
        volRepository.save(vol);

        reservationRepository.deleteById(id);

    }

    @Override
    public void updateReservation(Reservation reservation , Long id) {
        Optional<Reservation> reservations = reservationRepository.findById(id);
        Vol vol = reservations.get().getVol();
        int nA = vol.getNombreClassA();
        int nB = vol.getNombreClassB();
        if(reservations.get().getClasseplace()=="A"){
            vol.setNombreClassA(nA-1);            
        }
        else{
            vol.setNombreClassB(nB-1);
        }
        volRepository.save(vol);
        reservationRepository.save(reservation);
      Vol vol2 =reservation.getVol();
      int nA1 = vol.getNombreClassA();
        int nB1 = vol.getNombreClassB();
        if(reservations.get().getClasseplace()=="A"){
            vol.setNombreClassA(nA1+1);            
        }
        else{
            vol.setNombreClassB(nB1+1);
        }
        volRepository.save(vol2);
       
    }

    @Override
    public List<Reservation> reservations() {

        return reservationRepository.findAll();
    }
    void update(){

    }

}
