package com.rimair.app.rimair.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {
    @Id
    private Long id;
    @Column
    private Date date_reservation;
    @ManyToOne
    @JoinColumn(name = "id_cliet")
    
    private User User;
    @ManyToOne
    @JoinColumn(name = "code_vol")
    private Vol vol;
    @Column
    private String classeplace;
    @Column
    private double prix;
}
