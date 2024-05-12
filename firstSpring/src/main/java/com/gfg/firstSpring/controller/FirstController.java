package com.gfg.firstSpring.controller;

import com.gfg.firstSpring.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    private final GreetService greetService;




    @Autowired
    public FirstController(@Qualifier("greetHelloServiceImpl") GreetService greetService) {
        this.greetService = greetService;
    }
    @GetMapping("/greet")
    public String sayHello(@RequestParam
                               String name) {
        System.out.println("Iam called for greet");
        return greetService.sayHello(name);
    }
}




/***
 * 1.Someone will call our application
 * 2.Controller will be the one to recieve the call
 * 3.Controller will call service layer based on the input
 * 4.Service will act on the data, which includes CRUD operations-?CREATE, READ, UPDATE AND DELETE
 *
 * Design Pattern  of design api
 * 1.Singleton
 * 2.Prototype
 *
 *
 */

