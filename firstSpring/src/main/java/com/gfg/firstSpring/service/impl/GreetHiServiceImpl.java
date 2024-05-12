package com.gfg.firstSpring.service.impl;

import com.gfg.firstSpring.service.GreetService;
import org.springframework.stereotype.Service;


@Service
public class GreetHiServiceImpl implements GreetService {

    GreetHiServiceImpl(){
        System.out.println("Iam getting created");
    }
    @Override
    public String sayHello(String  name) {
        return "Iam getting HI Created";
    }
}
