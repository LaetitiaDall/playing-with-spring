package kami.springframework.didemo.liskov_substitution_principle;

public class Bicycle extends DeviceWithoutEngine {
    @Override
    public void startMoving() {
        System.out.println("The bicyle is moving!");
    }
}
