package com.rimair.app.rimair.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rimair.app.rimair.models.User;

public interface UserRepository extends JpaRepository<User ,Long> {
    User findByUsername(String username);

  
}
