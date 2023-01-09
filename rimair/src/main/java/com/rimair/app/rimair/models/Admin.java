package com.rimair.app.rimair.models;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends User {
   
}
    



