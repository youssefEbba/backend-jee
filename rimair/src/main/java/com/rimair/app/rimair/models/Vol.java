package com.rimair.app.rimair.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Vol {
    @Id
    private Long code_vol ;
    @Column 
    private Date dateDepart;
    @Column
    private String ville_depat;
    @Column
    private String ville_dest;
    @Column
    private int nombreClassA;
    @Column 
    private double prixClassA;
    @Column
    private int nombreClassB;
    @Column 
    private double prixClassB;

    


}
