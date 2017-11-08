package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 80657 on 2017/11/7.
 */
@RestController
public class Home {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("consumehystrix")
    public String hello(){


        return restTemplate.getForEntity("http://HELLO/index",String.class).getBody();

    }


}
