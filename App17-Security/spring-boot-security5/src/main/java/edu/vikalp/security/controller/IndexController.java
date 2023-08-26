package edu.vikalp.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class IndexController {

    //@PreAuthorize("hasRole('SUPER')")
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
