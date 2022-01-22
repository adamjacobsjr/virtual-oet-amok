package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDragonTest {
    @Test
    public void testGoForWalk() {
        OrganicDragon underTest = new OrganicDragon("Aspen", "It is a robot Dragon that sort of resembles MechaGodzilla and blue eyes.", 100, 100, 100, 100, 50, 100, 100);
        underTest.goForFly();
        int cleanliness = underTest.getCleanliness();
        assertEquals(35, cleanliness);
    }
}
