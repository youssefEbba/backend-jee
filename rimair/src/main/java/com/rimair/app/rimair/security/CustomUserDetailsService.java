package com.rimair.app.rimair.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.rimair.app.rimair.dao.UserRepository;

import com.rimair.app.rimair.models.User;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    
   @Autowired
   private UserRepository UserRepository;
   private Logger LOGGER = LoggerFactory.getLogger(getClass());
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = UserRepository.findByUsername(username);
     
        if(user ==null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        else{
            LOGGER.info(username);
        return new CustomUserDetails(user);
        }
    }
    
}
