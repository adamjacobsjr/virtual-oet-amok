package pets_amok;

public class VirtualRobotAnimals extends VirtualPet {
    //Fields
    protected int maintenance;

    public VirtualRobotAnimals(String name, String description, int unhappy, int boredom, int healthRisk, int tiredness, int maintenance) {
        super(name, description, unhappy, boredom, healthRisk, tiredness);
        this.maintenance = maintenance;
    }

    public void oil(int oiling) {
        maintenance -= oiling;
        if (maintenance < 0) {
            maintenance = 0;
        } else if (maintenance > 100) {
            maintenance = 100;
        }
        CallFieldsFromVP();
    }

    public int getMaintenance() {
        return maintenance;
    }

    @Override
    public void tick() {
        super.tick();
        maintenance += 4;
        if (maintenance > 100) {
            maintenance = 100;
        }
    }

    private void CallFieldsFromVP() {
        happiness(15);
        heal(15);
        play(-5);
        recharge(-10);
    }
}