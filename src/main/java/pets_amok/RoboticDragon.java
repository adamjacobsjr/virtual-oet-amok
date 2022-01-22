package pets_amok;

public class RoboticDragon extends VirtualRobotAnimals implements FlyDragons {

    public RoboticDragon(String animalName, String animalDescription, int animalMood, int animalBoredom, int animalHealth, int animalTiredness, int maintenance) {
        super(animalName, animalDescription, animalMood, animalBoredom, animalHealth, animalTiredness, maintenance);
    }

    @Override
    public void goForFly() {
        oil(-10);
        happiness(10);
        heal(10);
        play(5);
        recharge(-10);
    }
}