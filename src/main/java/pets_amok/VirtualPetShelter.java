package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> shelterMap = new HashMap<>();

    public void addPet(VirtualPet animal) {
        shelterMap.put(animal.getName().toLowerCase(), animal);
    }

    public void removePet(String petName) {
        shelterMap.remove(petName);
    }

    public Collection<VirtualPet> viewAnimalValues() {
        return shelterMap.values();
    }

    public void playOnePet(String petName, int activity) {
        shelterMap.get(petName).play(activity);
    }

    public VirtualPet returnOnePet(String petName) {
        return shelterMap.get(petName);
    }

    public void rechargeAll(int nap) {
        for (VirtualPet tirednessPet : shelterMap.values()) {
            tirednessPet.recharge(nap);
        }
    }

    public void waterOrganicAnimals(int water) {
        for (VirtualPet thirstPet : shelterMap.values()) {
            if (thirstPet instanceof VirtualOrganicAnimals) {
                ((VirtualOrganicAnimals) thirstPet).drink(water);
            }
        }
    }

    public void feedOrganicAnimals(int food) {
        for (VirtualPet feedPet : shelterMap.values()) {
            if (feedPet instanceof VirtualOrganicAnimals) {
                ((VirtualOrganicAnimals) feedPet).eat(food);
            }
        }
    }

    public void cleanOrganicAnimals(int waste) {
        for (VirtualPet cleanWaste : shelterMap.values()) {
            if (cleanWaste instanceof VirtualOrganicAnimals) {
                ((VirtualOrganicAnimals) cleanWaste).cleanSoils(waste);
            }
        }
    }

    public void oilRoboticAnimals(int oilPet) {
        for (VirtualPet maintain : shelterMap.values()) {
            if (maintain instanceof VirtualRobotAnimals) {
                ((VirtualRobotAnimals) maintain).oil(oilPet);
            }
        }
    }

    public void flyAllDragons() {
        for (VirtualPet flyingDragons : shelterMap.values()) {
            if (flyingDragons instanceof FlyDragons) {
                ((FlyDragons) flyingDragons).goForFly();
            }
        }
    }

    public void listPetName() {
        for (VirtualPet nameOfPet : shelterMap.values()) {
            System.out.println(nameOfPet.getName() + ": " + nameOfPet.getDescription());
        }
    }

    public boolean isAnimalInShelter(String petName) {
        return shelterMap.containsKey(petName);
    }

    public void tickAll() {
        for (VirtualPet tickForPet : shelterMap.values()) {
            tickForPet.tick();
        }
    }
}