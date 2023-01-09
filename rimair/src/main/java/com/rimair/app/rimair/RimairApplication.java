package com.rimair.app.rimair;


// import java.util.Date;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rimair.app.rimair.dao.UserRepository;
import com.rimair.app.rimair.dao.VolRepository;
import com.rimair.app.rimair.metier.ReservationMetier;
// import com.rimair.app.rimair.models.Reservation;
// import com.rimair.app.rimair.models.User;
// import com.rimair.app.rimair.models.Vol;

@SpringBootApplication
public class RimairApplication implements CommandLineRunner{
	@Autowired
	
	VolRepository volRepository;
	@Autowired

	UserRepository userrepository;
	@Autowired

	ReservationMetier reservationMetier;
	public static void main(String[] args) {
		SpringApplication.run(RimairApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		// Optional<Vol> vol =volRepository.findById((long) 127);
        // Optional<User> user = userrepository.findById((long) 11);
        // Reservation reservation = new Reservation(new Long(2543),new Date(),user.get(),vol.get(),"B",250);
        //  reservationMetier.saveReservation(reservation);
	}
    
}
