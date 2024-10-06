package com.example.sumapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {
   
    //@Autowired
    
    private Service service;

    SumController(Service service){
        this.service = service;
    }

    @GetMapping("/sum/{num1}/{num2}")
    public int findSum(@PathVariable int num1, @PathVariable int num2){
       return service.sum(num1, num2);
    }

    // public void setService(Service service){
    //     this.service = service;
    // }

}
