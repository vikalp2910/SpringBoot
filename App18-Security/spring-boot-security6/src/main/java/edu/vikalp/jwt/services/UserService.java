package edu.vikalp.jwt.services;

import edu.vikalp.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Vikalp Sonkar","vikalp2910@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Anita Sonkar","anita0@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"vikson Sonkar","vikson2910@gmail.com"));
    }

    private List<User> store=new ArrayList();

    public List<User> getUsers(){
        return this.store;
    }
}
