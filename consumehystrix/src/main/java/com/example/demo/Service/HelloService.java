package com.example.demo.Service;

import com.example.demo.interfaces.IHello;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 80657 on 2017/11/7.
 */
@Service
public class HelloService implements IHello {
    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "failback")
    public String helloservice(){


        return restTemplate.getForEntity("http://HELLO/index",String.class).getBody();

    }

    public String failback(){

        return "error";

    }
}
