package edu.vikalp.services;

import edu.vikalp.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    List<User> list=new ArrayList();
    public UserService(){
        list.add(new User("vikalp","Apache@2910","vikalp2910@gmail.com"));
        list.add(new User("Anita","Apache@2911","anita@gmail.com"));
        list.add(new User("sonkar","Apache@2912","sonkar@gmail.com"));
    }

    //get all users
    public List<User> getAllUsers(){
        return list;
    }

    //get single user
    public User getUser(String userName){
//        return list.stream().
//                filter(user->user.getUserName().equals(userName))
//                .collect(Collectors.toList()).get(0);

        return list.stream()
                .filter(user->user.getUserName().equals(userName))
                .findAny().orElse(null);
    }

    //add new user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }

}
