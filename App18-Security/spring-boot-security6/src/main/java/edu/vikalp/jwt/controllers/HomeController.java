package edu.vikalp.jwt.controllers;

import edu.vikalp.jwt.models.User;
import edu.vikalp.jwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8081/admin/users
    @GetMapping(path = "/users")
    public List<User> getUsers(){
        System.out.println("getting users");
        return this.userService.getUsers();
    }

    //http://localhost:8081/admin/users
    @GetMapping(value = "/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}


