package com.vikalp.zipkin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v2")
@Slf4j
public class SecondRestController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/showB")
    public String showB(){
       log.info("2222222222 welcome to service 2222222222222");
    //   restTemplate.getForObject("http://localhost:8083/showB",String.class);
       log.info("222222222 back to service 22222222222");
        return "app2222222222";
    }
}
