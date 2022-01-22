package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualOrganicAnimalTest {

    @Test
    public void testEatMethod() {
        VirtualOrganicAnimals underTest = new VirtualOrganicAnimals("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        underTest.eat(10);
        int hunger = underTest.getHunger();
        assertEquals(90, hunger);
    }

    @Test
    public void testThirstMethod() {
        VirtualOrganicAnimals underTest = new VirtualOrganicAnimals("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        underTest.drink(20);
        int thirst = underTest.getThirst();
        assertEquals(80, thirst);
    }

    @Test
    public void testCleanlinessMethod() {
        VirtualOrganicAnimals underTest = new VirtualOrganicAnimals("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        underTest.cleanSoils(15);
        int cleanliness = underTest.getCleanliness();
        assertEquals(85, cleanliness);
    }

    @Test
    public void testCleanlinessGetter() {
        VirtualOrganicAnimals underTest = new VirtualOrganicAnimals("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 80, 100, 100);
        int cleanliness = underTest.getCleanliness();
        assertEquals(80, cleanliness);
    }

    @Test
    public void testEatGetter() {
        VirtualOrganicAnimals underTest = new VirtualOrganicAnimals("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 70, 100);
        int hunger = underTest.getHunger();
        assertEquals(70, hunger);
    }

    @Test
    public void testThirstGetter() {
        VirtualOrganicAnimals underTest = new VirtualOrganicAnimals("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        int thirst = underTest.getThirst();
        assertEquals(100, thirst);
    }

    @Test
    public void testTickMethod() {
        VirtualOrganicAnimals underTest = new VirtualOrganicAnimals("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 90);
        underTest.tick();
        assertEquals(92, underTest.getThirst());
    }
}



