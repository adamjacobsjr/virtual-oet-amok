package pets_amok;

public class OrganicDragon extends VirtualOrganicAnimals implements FlyDragons {

    public OrganicDragon(String name, String description, int unhappy, int boredom, int healthRisk, int tiredness, int cleanliness, int hunger, int thirst) {
        super(name, description, unhappy, boredom, healthRisk, tiredness, cleanliness, hunger, thirst);
    }

    @Override
    public void goForFly() {
        cleanSoils(15);
        drink(-20);
        eat(-20);
        happiness(10);
        heal(10);
        play(5);
        recharge(-10);
    }
}

