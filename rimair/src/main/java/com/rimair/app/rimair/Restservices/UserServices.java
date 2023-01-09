package com.rimair.app.rimair.Restservices;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rimair.app.rimair.metier.UserMetier;
import com.rimair.app.rimair.models.User;


@RestController
public class UserServices {
    @Autowired
    private UserMetier userMetier;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> listUser() {
        return userMetier.listUsers();
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void saveUser(@RequestBody User user) {
        userMetier.saveUser(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        userMetier.deleteUser(id);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public void dupdateUser(@RequestBody User user, @PathVariable Long id) {
        userMetier.updateUser(user, id);
    }

    @RequestMapping(value = "/login")
    String login() {
        return "hello";
    }
    @RequestMapping(value = "/")
    String home() {
        return "home page";
    }
   

}
