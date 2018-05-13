package kami.springframework.didemo.dependency_injection.controllers;

import kami.springframework.didemo.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String SayHello() {
        return this.greetingService.sayGreeting();
    }
}
