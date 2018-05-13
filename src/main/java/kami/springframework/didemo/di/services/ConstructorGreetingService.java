package kami.springframework.didemo.di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static String HELLO_GURUS = "Hello from ConstructorGreetinService";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
