package com.rimair.app.rimair.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimair.app.rimair.dao.UserRepository;
import com.rimair.app.rimair.models.User;


@Service
public class UserMetierImp implements UserMetier {

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User User) {
        userRepository.save(User);

    }

    @Override
    public List<User> listUsers() {

        return userRepository.findAll();
    }

 

    @Override
    public void deleteUser(Long User) {
      userRepository.deleteById(User);

    }

    @Override
    public void updateUser(User User, Long id) {
        // TODO Auto-generated method stub
        
    }

}
