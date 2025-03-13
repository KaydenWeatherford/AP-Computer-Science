package Q3.Farm;

import java.util.ArrayList;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public boolean feedAllAnimals() {
        return false;
    }

    public double farmIncome() {
        return 0;
    }

    public int getWeight() {
        return 0;
    }

    public double getCost() {
        return 0;
    }

    public ArrayList<Cow> getCows() {
        return null;
    }

    public ArrayList<Horse> getHorses() {
        return null;
    }
}

