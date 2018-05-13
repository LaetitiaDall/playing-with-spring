package kami.springframework.didemo.interface_segregation_principle;

public abstract class Toy {
    Double price;
    String color;

    public void setPrice(Double price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
