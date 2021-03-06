package kami.springframework.didemo.dependency_injection.services;

import kami.springframework.didemo.dependency_injection.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingEnglishService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingEnglishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getEnglishGreeting();
    }
}
