package edu.vikalp.controller;

import edu.vikalp.models.User;
import edu.vikalp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;


    //get all users
    // http://localhost:8080/api/v1/users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //get single user
    // http://localhost:8080/api/v1/vikalp
    @GetMapping("/{userName}")
    public User getUser(@PathVariable  String userName){
        return userService.getUser(userName);
    }

    //add a user
    // http://localhost:8080/api/v1/add-user
    @PostMapping("/add-user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

}
