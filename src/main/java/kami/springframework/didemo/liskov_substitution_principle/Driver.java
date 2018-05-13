package kami.springframework.didemo.liskov_substitution_principle;

public class Driver {

    private TransportationDevice transportationDevice;

    public TransportationDevice getTransportationDevice() {
        return transportationDevice;
    }

    public void setTransportationDevice(TransportationDevice transportationDevice) {
        this.transportationDevice = transportationDevice;
    }

    public void move(){
        this.transportationDevice.startMoving();
    }
}
