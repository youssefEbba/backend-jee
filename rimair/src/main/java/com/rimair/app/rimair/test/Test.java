package com.rimair.app.rimair.test;

// import java.util.Date;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.rimair.app.rimair.dao.UserRepository;
import com.rimair.app.rimair.dao.VolRepository;
import com.rimair.app.rimair.metier.ReservationMetier;
// import com.rimair.app.rimair.models.Reservation;
// import com.rimair.app.rimair.models.User;
// import com.rimair.app.rimair.models.Vol;

public class Test {
    @Autowired
  VolRepository volRepository;
  @Autowired
  UserRepository repository;
  @Autowired
  ReservationMetier reservationMetier;
    public static void main(String[] args) {

        
       
    }
    void test(){
      
    //     Optional<Vol> vol =volRepository.findById((long) 127);
    //     Optional<User> user = repository.findById((long) 11);
    //     Reservation reservation = new Reservation(new Long(2540),new Date(),user.get(),vol.get(),"A",250);
    //      reservationMetier.saveReservation(reservation);
    // 
}

}
