package com.vikalp.zipkin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1")
public class FirstRestController {
    private static final Logger LOGGER= LoggerFactory.getLogger(FirstRestController.class);
    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/showA")
    public String showA(){
        LOGGER.info("111111111 welcome to service 11111111111");
        String result=restTemplate.getForObject("http://localhost:8082/v2/showB",String.class);
        LOGGER.info("111111111 back to service 11111111111 "+result);
        return result;
    }

}
