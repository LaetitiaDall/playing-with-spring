package kami.springframework.didemo.di.repositories;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getFrenchGreeting() {
        return "Bonjour.";
    }

    @Override
    public String getGermanGreeting() {
        return "Bonjour.";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello.";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola.";
    }
}
