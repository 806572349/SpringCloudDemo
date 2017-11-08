package com.example.demo.interfaces;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by 80657 on 2017/11/7.
 */
public interface IHello {
    @HystrixCommand(fallbackMethod = "failback")
    String helloservice();
}
