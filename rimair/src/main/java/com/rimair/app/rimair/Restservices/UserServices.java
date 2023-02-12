package com.rimair.app.rimair.Restservices;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.HttpStatus.OK;
import com.rimair.app.rimair.dao.UserRepository;
import com.rimair.app.rimair.metier.UserMetier;
import com.rimair.app.rimair.models.User;

@CrossOrigin
@RestController
public class UserServices {
    
    @Autowired
    private UserMetier userMetier;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
	private PasswordEncoder passwordEncoder;
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> listUser() {
        return userMetier.listUsers();
    }
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void saveUser(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
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

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public ResponseEntity<User> login(@RequestBody User user) {
        authenticate(user.getUsername(), user.getPassword());
        User loginUser = userRepository.findByUsername(user.getUsername());
        return new ResponseEntity<>(loginUser, OK);
    }
    @RequestMapping(value = "/")
    String home() {
        return "home page";
    }
    private void authenticate(String username, String password) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
    }

}
