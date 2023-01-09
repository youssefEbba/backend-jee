package com.rimair.app.rimair.metier;

import java.util.List;

import com.rimair.app.rimair.models.User;

public interface UserMetier {
    void saveUser(User user);

    List<User> listUsers();

    void updateUser(User User ,Long id);

    void deleteUser(Long id);

}