package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    @GetMapping("/fortune")
    public String myFortune(){
        return "Today is lucky day!";
    }
    @GetMapping("/workout")
    public String myWorkOut(){
        return "Run 5Km daily";
    }
}
