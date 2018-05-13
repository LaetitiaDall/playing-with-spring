package kami.springframework.didemo.liskov_substitution_principle;

public abstract class DeviceWithEngine extends TransportationDevice {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract void startEngine();
}
