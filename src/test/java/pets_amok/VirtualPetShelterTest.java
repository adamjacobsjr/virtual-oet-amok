package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class
VirtualPetShelterTest {
    @Test
    public void testAddPet() {
        VirtualPet underTest = new OrganicRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        assertEquals("Fluffy", testShelter.returnOnePet("Fluffy").getName());
    }

    @Test
    public void testRemovePet() {
        VirtualPet underTest = new OrganicRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        assertEquals("Fluffy", testShelter.returnOnePet("Fluffy").getName());
        testShelter.removePet("Fluffy");
        assertEquals(false, testShelter.isAnimalInShelter("Fluffy"));
    }

    @Test
    public void testCollection() {
        VirtualPet underTest = new OrganicRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        assertEquals(1, testShelter.viewAnimalValues().size());
    }

    @Test
    public void testPlayOne() {
        VirtualPet underTest = new OrganicRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.playOnePet("Fluffy", 10);
        assertEquals(90, testShelter.returnOnePet("Fluffy").getBoredom());
    }

    @Test
    public void testRechargeAll() {
        VirtualPet underTest = new OrganicRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.rechargeAll(10);
        assertEquals(90, testShelter.returnOnePet("Fluffy").getTiredness());
    }

    @Test
    public void testWater() {
        VirtualPet underTest = new OrganicRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.waterOrganicAnimals(10);
        assertEquals(90, ((VirtualOrganicAnimals) testShelter.returnOnePet("Fluffy")).getThirst());
    }

    @Test
    public void testFeed() {
        VirtualPet underTest = new OrganicRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.feedOrganicAnimals(10);
        assertEquals(90, ((VirtualOrganicAnimals) testShelter.returnOnePet("Fluffy")).getHunger());
    }

    @Test
    public void testOil() {
        VirtualPet underTest = new RoboticRapter("Aspen", "It is a robot Dragon that sort of resembles MechaGodzilla and blue eyes.", 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.oilRoboticAnimals(10);
        assertEquals(90, ((VirtualRobotAnimals) testShelter.returnOnePet("Aspen")).getMaintenance());
    }

    @Test
    public void testWalk() {
        VirtualPet underTest = new RoboticDragon("Aspen", "It is a robot Dragon that sort of resembles MechaGodzilla and blue eyes.", 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.flyAllDragons();
        assertEquals(100, ((VirtualRobotAnimals) testShelter.returnOnePet("Aspen")).getBoredom());
    }

    @Test
    public void testTickAll() {
        VirtualPet underTest = new RoboticRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.tickAll();
        assertEquals(100, ((VirtualRobotAnimals) testShelter.returnOnePet("Fluffy")).getMaintenance());
    }
}