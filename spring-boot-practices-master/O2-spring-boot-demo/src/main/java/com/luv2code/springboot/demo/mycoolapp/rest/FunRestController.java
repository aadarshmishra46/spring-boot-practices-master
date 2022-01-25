package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
    //expose "/" that return "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello world ! Time on the server is:"+ LocalDateTime.now();
    }
    //expose a new end for workout
    @GetMapping("/workout")
    public  String  getDailyWorkout(){
        return "run 5km in a day";
    }
    @GetMapping("/food")
    public  String  getFood(){
        return "eat banana";
    }
    @GetMapping("/color")
    public String getColor(){
        return "black";
    }

}
