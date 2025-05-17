package com.example.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    String sayHello(){
        return "Hi from the Api";
    }
}
