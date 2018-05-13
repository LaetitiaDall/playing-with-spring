package kami.springframework.didemo.di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static String HELLO_GURUS = "Hello - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
