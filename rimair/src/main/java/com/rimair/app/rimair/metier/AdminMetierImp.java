package com.rimair.app.rimair.metier;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimair.app.rimair.dao.AdminRepository;
import com.rimair.app.rimair.models.Admin;

@Service
public class AdminMetierImp implements AdminMetier{
   @Autowired
   AdminRepository adminRepository;
    @Override
    public Optional<Admin> getAdmin(Admin admin) {
      return adminRepository.findById(admin.getId());
    } 

    @Override
    public void saveAdmin(Admin admin) {
        
    }
    
}
