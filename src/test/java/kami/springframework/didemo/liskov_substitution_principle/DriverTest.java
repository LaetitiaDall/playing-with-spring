package kami.springframework.didemo.liskov_substitution_principle;

import org.junit.Test;

public class DriverTest {


    @Test
    public void shouldDriveAnyTypeOfTransportationDevice() {
        Driver driver = new Driver();
        driver.setTransportationDevice(new Car());
        driver.move();

        driver.setTransportationDevice(new Bicycle());
        driver.move();
    }
}
