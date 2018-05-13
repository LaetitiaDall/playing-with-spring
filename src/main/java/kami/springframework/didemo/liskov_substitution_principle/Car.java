package kami.springframework.didemo.liskov_substitution_principle;

public class Car extends DeviceWithEngine {
    @Override
    public void startEngine() {
        System.out.println("Starting the engine...");
    }

    @Override
    public void startMoving() {
        this.startEngine();
        System.out.println("The car is moving !");
    }
}
