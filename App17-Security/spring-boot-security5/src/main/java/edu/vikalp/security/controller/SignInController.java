package edu.vikalp.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/signin")
public class SignInController {

    @GetMapping("/show")
    public String signIn(){
        return "login.html";
    }
}
