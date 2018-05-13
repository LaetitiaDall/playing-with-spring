package kami.springframework.didemo.di.services;

import kami.springframework.didemo.di.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreatingProfile implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreatingProfile(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getSpanishGreeting();
    }
}
