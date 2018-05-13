package kami.springframework.didemo.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static String HELLO_GURUS = "Hello grom SetterGreetinService";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
