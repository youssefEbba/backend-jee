package com.rimair.app.rimair.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rimair.app.rimair.models.Paiment;

public interface PayementRepository extends JpaRepository<Paiment,Long>{
    
}
