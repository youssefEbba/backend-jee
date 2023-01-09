package com.rimair.app.rimair.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rimair.app.rimair.dao.AdminRepository;
import com.rimair.app.rimair.dao.UserRepository;

import com.rimair.app.rimair.models.User;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    
   @Autowired
   private UserRepository UserRepository;
   @Autowired
   private AdminRepository adminRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = UserRepository.findByUsername(username);
        User admin = adminRepository.findByUsername(username);
        if(user ==null||admin==null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new CustomUserDetails(admin);
        
    }
    
}
