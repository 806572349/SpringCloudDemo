package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 80657 on 2017/11/7.
 */
@RestController
public class HelloController {

        @GetMapping("index")
        public String index(){




            return "hello world";
        }
}
