package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class FunRestController {
    //expose "/" that return "hello world"

    @GetMapping("/hello")
    public List getHello(){
        List l=new ArrayList();
        l.add("Helloword234");
        return l;
    }
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
