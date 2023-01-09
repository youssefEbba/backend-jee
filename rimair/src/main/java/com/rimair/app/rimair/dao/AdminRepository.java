package com.rimair.app.rimair.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rimair.app.rimair.models.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findByUsername(String username);
}
