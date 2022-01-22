package pets_amok;

public class VirtualPet {

    private String name;
    private String description;
    private int unhappy;
    private int boredom;
    private int healthRisk;
    private int tiredness;

    public VirtualPet(String name, String description, int unhappy, int boredom, int healthRisk, int tiredness) {
        this.name = name;
        this.description = description;
        this.unhappy = unhappy;
        this.boredom = boredom;
        this.healthRisk = healthRisk;
        this.tiredness = tiredness;
    }

    public void heal(int healing) {
        healthRisk -= healing;
        if (healthRisk < 0) {
            healthRisk = 0;
        }
    }

    public void happiness(int happy) {
        unhappy -= happy;
        if (unhappy < 0) {
            unhappy = 0;
        }
    }

    public void recharge(int recharging) {
        tiredness -= recharging;
        if (tiredness < 0) {
            tiredness = 0;
        } else if (tiredness > 100) {
            tiredness = 100;
        }
        unhappy -= 15;
        if (unhappy < 0) {
            unhappy = 0;
        }
        healthRisk -= 15;
        if (healthRisk < 0) {
            healthRisk = 0;
        }
        boredom += 5;
        if (boredom > 100) {
            boredom = 100;
        }
    }

    public void play(int playing) {
        boredom -= playing;
        if (boredom < 0) {
            boredom = 0;
        }
        unhappy -= 15;
        if (unhappy < 0) {
            unhappy = 0;
        }
        healthRisk -= 15;
        if (healthRisk < 0) {
            healthRisk = 0;
        }
        tiredness += 10;
        if (tiredness > 100) {
            tiredness = 100;
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getUnhappy() {
        return unhappy;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHealthRisk() {
        return healthRisk;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void tick() {
        boredom += 15;
        if (boredom > 100) {
            boredom = 100;
        }
        unhappy += 10;
        if (unhappy > 100) {
            unhappy = 100;
        }
        healthRisk += 5;
        if (healthRisk > 100) {
            healthRisk = 100;
        }
        tiredness += 7;
        if (tiredness > 100) {
            tiredness = 100;
        }
    }
}