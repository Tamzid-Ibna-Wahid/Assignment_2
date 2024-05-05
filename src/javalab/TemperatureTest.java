package javalab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class TemperatureTest {

    Temperature passenger1, passenger2, driver1, driver2;

    @BeforeEach
    void setup(){
        passenger1 = new Temperature();
        passenger2 = new Temperature(60, 70);
        driver1 = new Temperature(30, 40);
        driver2 = new Temperature(20, 40);
    }

    @Test
    void temperature1() {
        passenger1.up();
        passenger1.up();
        passenger1.up();
        passenger1.up();
        assertEquals(49, passenger1.getCurrentTemperature());
    }
    @Test
    void temperature2() {
        passenger2.up();
        passenger2.up();
        passenger2.down();
        passenger2.down();
        assertEquals(65, passenger2.getCurrentTemperature());
    }

    @Test
    void temperature3() {
        driver1.up();
        driver1.up();
        driver1.up();
        driver1.down();
        assertEquals(37, driver1.getCurrentTemperature());
    }
    @Test
    void temperature4() {
        driver2.up();
        driver2.up();
        driver2.down();
        driver2.down();
        assertEquals(30, driver2.getCurrentTemperature());
    }




}