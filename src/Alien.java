public class Alien {
    //step 3: declaring variables
    public int energyLevel;
    public int hostilityIndex;

    public Alien(int pEnergyLevel, int pHostilityIndex){  //step 3: constructor
        energyLevel=pEnergyLevel;
        hostilityIndex=pHostilityIndex;
    }

    public void printInfo(){  //step 3: print info
        System.out.println("This alien's energy level is "+energyLevel+", and its hostility index is "+hostilityIndex);
    }
}
