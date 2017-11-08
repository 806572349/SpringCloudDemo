package com.example.demo.Controller;

import com.example.demo.Service.HelloService;
import com.example.demo.interfaces.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 80657 on 2017/11/7.
 */
@RestController
public class Home {

    @Autowired
    IHello helloService;
    @GetMapping("consumehystrix")
    public String hello(){


        return helloService.helloservice();

    }
}
