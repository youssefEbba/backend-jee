package com.rimair.app.rimair.models;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@NoArgsConstructor


@Entity
@DiscriminatorValue("CLIENT")
public class Client  extends User{
    @Setter
    @Getter
    private String passport;

}
