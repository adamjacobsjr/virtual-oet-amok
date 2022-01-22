
package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticDragonTest {

    @Test
    public void testGoForFly() {
        RoboticDragon underTest = new RoboticDragon("Aspen", "It is a robot Dragon that sort of resembles MechaGodzilla and blue eyes.", 100, 100, 100, 100, 50);
        underTest.goForFly();
        int oil = underTest.getMaintenance();
        assertEquals(60, oil);
    }
}