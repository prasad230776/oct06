package com.example.sumapp;

import org.springframework.stereotype.Service;

@Service
public class SumService implements com.example.sumapp.Service{

   public int sum(int n1, int n2){
    return n1 + n2;
   }
    
}
