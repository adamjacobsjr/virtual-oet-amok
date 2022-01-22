package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int usersSelectionNumber = 1;
        String userSelectionName;
        String userSelectionDescription;

        Scanner stringInput = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);

        VirtualPet pet1 = new OrganicRapter("Fluffy", "He is an older Rapter with am attitude. Slightly temperamental", 100, 100, 100, 100, 100, 100, 100);
        VirtualPet pet2 = new RoboticDragon("Aspen", "It is a robot Dragon that sort of resembles MechaGodzilla and blue eyes.", 100, 100, 100, 100, 100);
        VirtualPet pet3 = new OrganicDragon("Cera", "She is fairly timid Green Dragon. Loves open spaces and cool shade.", 100, 100, 100, 100, 100, 100, 100);
        VirtualPet pet4 = new RoboticRapter("Night", "She is a playful Velociraptor. Loves the thrill of the hunt and a good oiling", 100, 100, 100, 100, 100);

        VirtualPetShelter actualShelter = new VirtualPetShelter();
        actualShelter.addPet(pet1);
        actualShelter.addPet(pet2);
        actualShelter.addPet(pet3);
        actualShelter.addPet(pet4);

        welcome();
        animalsStats(actualShelter);
        gameLoop(usersSelectionNumber, stringInput, userInput, actualShelter);
    }

    private static void gameLoop(int usersSelectionNumber, Scanner stringInput, Scanner userInput, VirtualPetShelter actualShelter) {
        String userSelectionName;
        String userSelectionDescription;
        while (usersSelectionNumber != 0) {
            directions();
            usersSelectionNumber = userInput.nextInt();
            if (usersSelectionNumber == 1) {
                actualShelter.feedOrganicAnimals(35);
                System.out.println("The organic animals look well fed. Thanks!");
            } else if (usersSelectionNumber == 2) {
                press2(stringInput, actualShelter);
            } else if (usersSelectionNumber == 3) {
                actualShelter.rechargeAll(40);
                System.out.println("Shhh... They are all recharging");
            } else if (usersSelectionNumber == 4) {
                actualShelter.flyAllDragons();
                System.out.println("The Dragons enjoyed the fly time. Thanks!");
            } else if (usersSelectionNumber == 5) {
                actualShelter.waterOrganicAnimals(30);
                System.out.println("Thanks for watering the organic animals!");
            } else if (usersSelectionNumber == 6) {
                actualShelter.cleanOrganicAnimals(55);
                System.out.println("Thanks for cleaning the rapter pen and dragon enclosure!");
            } else if (usersSelectionNumber == 7) {
                actualShelter.oilRoboticAnimals(30);
                System.out.println("The robotic animals are moving & looking great. Thanks!");
            } else if (usersSelectionNumber == 8) {
                press8(stringInput, actualShelter);
            } else if (usersSelectionNumber == 9) {
                usersSelectionNumber = press9(stringInput, userInput, actualShelter);
            } else if (usersSelectionNumber == 10) {
                actualShelter.listPetName();
            }
            if (usersSelectionNumber != 0) {
                actualShelter.tickAll();
                animalsStats(actualShelter);
            } else {
                System.out.println("\nThanks for surviving ..err helping today! We hope to have you back soon!");
            }
        }
    }

    private static int press9(Scanner stringInput, Scanner userInput, VirtualPetShelter actualShelter) {
        String userSelectionName;
        String userSelectionDescription;
        int usersSelectionNumber;
        System.out.println("Someone just found a stray. What should we name it?");
        userSelectionName = stringInput.nextLine();
        System.out.println("Please fill out the type of animal and a short description.");
        userSelectionDescription = stringInput.nextLine();
        System.out.println("Press 1 for organic Rapter\nPress 2 for organic Dragon\nPress 3 for robotic Rapter\nPress 4 for robotic Dragon");
        usersSelectionNumber = userInput.nextInt();
        userSelectsPetType(actualShelter, userSelectionName, userSelectionDescription, usersSelectionNumber);
        System.out.println("Great! " + userSelectionName + " has been added.");
        return usersSelectionNumber;
    }

    private static void userSelectsPetType(VirtualPetShelter actualShelter, String userSelectionName, String userSelectionDescription, int usersSelectionNumber) {
        VirtualPet newPet;
        if (usersSelectionNumber == 1) {
            newPet = new OrganicRapter(userSelectionName, userSelectionDescription, 100, 100, 100, 100, 100, 100, 100);
        } else if (usersSelectionNumber == 2) {
            newPet = new OrganicDragon(userSelectionName, userSelectionDescription, 100, 100, 100, 100, 100, 100, 100);
        } else if (usersSelectionNumber == 3) {
            newPet = new RoboticRapter(userSelectionName, userSelectionDescription, 100, 100, 100, 100, 100);
        } else {
            newPet = new VirtualRobotAnimals(userSelectionName, userSelectionDescription, 100, 100, 100, 100, 100);
        }
        actualShelter.addPet(newPet);
    }

    private static void press8(Scanner stringInput, VirtualPetShelter actualShelter) {
        String userSelectionName;
        actualShelter.listPetName();
        System.out.println("Put in the name of the animal you are signing adoption / liability waiver paper work for:");
        userSelectionName = stringInput.nextLine().toLowerCase();
        if (actualShelter.isAnimalInShelter(userSelectionName)) {
            System.out.println(actualShelter.returnOnePet(userSelectionName).getName() + " was just adopted.\n");
            actualShelter.removePet(userSelectionName);
        } else {
            System.out.println("Please pick from the names provided.\n");
        }
    }

    private static void press2(Scanner stringInput, VirtualPetShelter actualShelter) {
        String userSelectionName;
        actualShelter.listPetName();
        System.out.println("Please type in the pets name you would like to play with:");
        userSelectionName = stringInput.nextLine().toLowerCase();
        if (actualShelter.isAnimalInShelter(userSelectionName)) {
            actualShelter.returnOnePet(userSelectionName).play(30);
            System.out.println(actualShelter.returnOnePet(userSelectionName).getName() + " had fun playing with you!");
        } else {
            System.out.println("Please pick from the names provided.\n");
        }
    }

    private static void directions() {
        System.out.println("What would you like to do?\n" +
                "Press 1 to feed organic animals\n" +
                "Press 2 to play with an individual animal\n" +
                "Press 3 to energize all animals\n" +
                "Press 4 to fly all dragons\n" +
                "Press 5 to water organic animals\n" +
                "Press 6 to clean organic animals waste\n" +
                "Press 7 to oil robotic animals\n" +
                "Press 8 to sign adoption paper work\n" +
                "Press 9 to take in a new animal\n" +
                "Press 10 to read animal bios\n" +
                "Press 0 to end shift and exit game");
    }

    private static void animalsStats(VirtualPetShelter actualShelter) {
        System.out.println("\t\t\t\t\t\t Well Being Levels\n" +
                "\tName:\t| Hunger Level: | Thirst Level: | Waste Level: | Maintenance Level:" +
                " | Health Risk Level: | Unhappiness Level: | Boredom Level: | Tiredness Level:\n" +
                "------------|---------------|---------------|--------------|--------------------" +
                "|--------------------|--------------------|----------------|-----------------");
        for (VirtualPet animalPets : actualShelter.viewAnimalValues()) {
            if (animalPets instanceof VirtualOrganicAnimals) {
                System.out.println(animalPets.getName() + "\t\t|\t\t" + ((VirtualOrganicAnimals) animalPets).getHunger()
                        + "\t\t|\t\t" + ((VirtualOrganicAnimals) animalPets).getThirst()
                        + "\t\t|\t\t" + ((VirtualOrganicAnimals) animalPets).getCleanliness()
                        + "\t   |\t\t\t\t\t|\t\t" + animalPets.getHealthRisk() + "\t\t\t |\t\t\t"
                        + animalPets.getUnhappy() + "\t\t  | \t" +
                        animalPets.getBoredom() + "\t\t   |\t\t" + animalPets.getTiredness());
            } else {
                System.out.println(animalPets.getName() + "\t\t|\t\t\t\t|\t\t\t\t|              |\t\t"
                        + ((VirtualRobotAnimals) animalPets).getMaintenance()
                        + "\t\t\t|\t\t" + animalPets.getHealthRisk() + "\t\t\t |\t\t\t" + animalPets.getUnhappy() + "\t\t  |\t\t" +
                        animalPets.getBoredom() + "\t\t   |\t\t" + animalPets.getTiredness());
            }
        }
    }

    private static void welcome() {
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$**''''`` ````'''#*R$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$*''      ..........      `'#$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$#`    .ue@$$$********$$$$Weu.   ``*$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$#''   ue$$*#''               `'**$$N.  *R$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$P    u@$**`                          #$$o.  ^*$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$P  .o$R``               . .WN.           #$Nu  '#$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$`  .@$#`       'ou  .oeW$$$$$$$$W           `$$u  '$$$$$$$$$$$$");
        System.out.println("$$$$$$$$#   o$#`      ueL  $$$$$$$$$$$$$$$$ku.           $$u  $$$$$$$$$$$");
        System.out.println("$$$$$$$  x$P`        `$$u$$$$$$$$$$$$$$#####$$$L            $o  #*$$$$$$$");
        System.out.println("$$$$$$  d$        #$u.2$$$$$$$$$$$$$$$$  #$$$Nu#$            $$.  #$$$$$$");
        System.out.println("$$$$$  @$          $$$$$$$$$$$$$$$$$$$$k  $#$$#*$$u           #$L  #$$$$$");
        System.out.println("$$$$  d$         #Nu@$$$$$$$$$$$$$$$$$$   $x$$L #$$$o.         #$c  #$$$$");
        System.out.println("$$$F  d$          .$$$$$$$$$$$$$$$$$$$$N  $d$$$$  $$$$$u        #$L  #$$$");
        System.out.println("$$$  :$F        ..`$$$$$$$$$$$$$$$$$$$$$$$$$$$`    R$$$$$eu.     $$   $$$");
        System.out.println("$$!  $$        . R$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.   @$$$$$$$$Nu   '$N  `$$");
        System.out.println("$$  x$`        Re$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$uu@````$$$$$$$i   #$:  $$");
        System.out.println("$E  $$       c 8$$$$$$$$$$$$$$$$$$$$$G(   ``^*$$$$$$$WW$$$$$$$$N   $$  4$");
        System.out.println("$~ :$$N. tL i)$$$$$$$$$$$$$$$$$$$$$$$$$N       ^#R$$$$$$$$$$$$$$$   9$ '$");
        System.out.println("$  t$$$$u$$W$$$$$$$$$$$$$$!$$$$$$$$$$$$$&       . c?'*$$$R$$$$$$$  '$k  $");
        System.out.println("$  $$$$$$$$$$$$$$$$$$$$$'E F#$$$$$$$$$$.#        +.V#;*#x#.##*$$$   $B  $");
        System.out.println("$  $$$$$$$$$$$$$$$$`$)#F     $$$$$$$$$$$           `  -d>x`*=.``    $$  $");
        System.out.println("$  $$$$$$$$$$?$$R'$ `#d$``    #$$$$$$$$$ > .                '       $$  $");
        System.out.println("$  $$$$$$$($$@$'` P *@$.@#'!    '*$$$$$$$L!.                        $$  $");
        System.out.println("$  9$$$$$$$L#$L  ! * <$$`          **$$$$$NL:'z  f                  $E  $");
        System.out.println("$> ?$$$$ $$$b$^      .$c .ueu.        `#$$$$b'x'# ''                x$  $");
        System.out.println("$k  $$$$N$  $$L:$oud$$$` d$ .u.         #$$$$$o.'' #f.              $$  $");
        System.out.println("$$  R$''$$o.$'$$$$'''' ue$$$P'''c          '$$$$$$Wo'              :$F  $");
        System.out.println("$$: '$&  $*$$u$$$$u.ud$R  `    ^            `#*****                @$  $$");
        System.out.println("$$N  #$: E 3$$$$$$$$$                                             d$  x$$");
        System.out.println("$$$k  $$   F *$$$$*                                             :$P   $$$");
        System.out.println("$$$$  '$b                                                      .$P   $$$$");
        System.out.println("$$$$b  `$b                                                    .$$   @$$$$");
        System.out.println("$$$$$N  `$N                                                  .$P   @$$$$$");
        System.out.println("$$$$$$$$.  $N.                                            .@$    $$$$$$$$");
        System.out.println("$$$$$$$$$o   #$N.                                       .@$#  .@$$$$$$$$$");
        System.out.println("$$$$$$$$$$$u  `#$Nu                                   u@$#   u$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$u   `R$o.                             ue$R    u$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$o.  ^#$$bu.                     .uW$P`   .u$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$u   ``#R$$Wou..... ....uueW$$*#`   .u@$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$Nu.    ``##***$$$$$***##``    .o$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$eu..               ...ed$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$NWWeeeeedW@$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("\n");
        System.out.println("Welcome to Jurassic Park Dino & Dragon Rescue Center. We are excited to have your help, \nour previous volunteers had some unfortunate accidents. " +
                "We will need help with feeding, watering, playing \nwith each one individually, the dragons need to be let out for flight and the mechanical animals need oiled and maintained. " +
                "Not to mention their bio-waste, pens and stalls need cleaning too. \n Below is a list of \nthe dino's / dragons and their current well being status. " +
                "The well being status tracks \neach dinosaur / dragon hunger, boredom, and tiredness levels.  \n");
        System.out.println("\nWe are desperate for your help taking care of the Dinosaur / dragons  needs. They have all run amok." +
                "\nSelect 8 to adopt a Dinosaur. (you must sign a liability waiver. ) and select 9 to admit a dinosaur " +
                "\ninto the shelter. If you are curious to learn about each pet in the center select 10." +
                "\nSelect 0 once your shift is complete.\n");

    }
}

