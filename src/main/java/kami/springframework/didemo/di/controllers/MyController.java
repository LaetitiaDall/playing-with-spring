package kami.springframework.didemo.di.controllers;

import kami.springframework.didemo.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return this.greetingService.sayGreeting();
    }
}
