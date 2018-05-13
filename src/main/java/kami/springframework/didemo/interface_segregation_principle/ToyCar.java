package kami.springframework.didemo.interface_segregation_principle;

public class ToyCar extends Toy implements Movable {

    @Override
    public void move() {
        System.out.println("ToyCar is moving!");
    }

}
