package kami.springframework.didemo.liskov_substitution_principle;

public abstract class TransportationDevice {

    private String speed;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public abstract void startMoving();
}
