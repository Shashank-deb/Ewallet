package com.gfg.firstSpring.service.impl;

import com.gfg.firstSpring.service.GreetService;
import org.springframework.stereotype.Service;

@Service
public class GreetHelloServiceImpl implements GreetService {


    GreetHelloServiceImpl(){
        System.out.println("This is another creation");
    }

    @Override
    public String sayHello(String name) {
        return "Hello "+ name;
    }
}
