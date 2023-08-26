package edu.vikalp.secondapp.service;

import org.springframework.stereotype.Service;

//@Service
@Service("my-service")
public class MyService {

    public String m1(String name){
        return "hello "+name+" GoodMorning !!!!!";
    }
}
