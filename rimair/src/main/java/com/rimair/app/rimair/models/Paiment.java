package com.rimair.app.rimair.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Paiment {
    @Id
    private Long id;
    @Column
    private String bank;
    @Column
    private double montant;
    @Column
    private String description;
}
