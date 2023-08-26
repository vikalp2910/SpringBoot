package edu.vikalp.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstApp")
public class MyController {

    @RequestMapping("/m1")
    public String m1(){
        return "this is m1 method";
    }

    @GetMapping(value = "/m2")
    public String m2(){
        return "this is m2 method";
    }

    @GetMapping(path = "/m3")
    public String m3(){
        return "this is m3 method";
    }
}
