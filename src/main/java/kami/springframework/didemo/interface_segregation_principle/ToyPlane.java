package kami.springframework.didemo.interface_segregation_principle;

public class ToyPlane extends Toy implements Movable, Flyable {

    @Override
    public void fly() {
        System.out.println("ToyPlane is flying!");
    }

    @Override
    public void move() {
        System.out.println("ToyPlane is moving!");
    }

}
