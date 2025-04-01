package Q3.Farm;

import java.util.ArrayList;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public Farm(ArrayList<Cow> theCows, ArrayList<Horse> theHorses, int Hay, int Corn,
                double CostOHay, double cornCostOCorn) {
        myCows = theCows;
        myHorses = theHorses;
        myNumHayBales = Hay;
        myNumCorn = Corn;
        myHayCost = CostOHay;
        myCornCost = cornCostOCorn;
    }

    public boolean feedCows() {
        return true;
    }

    public boolean feedHorses() {
        return true;
    }

    public boolean feedAllAnimals() {
        int cornAte = 0;
        int hayAte = 0;
        for (Cow cow : myCows) {
            cornAte += cow.getNumCorn();
            hayAte += cow.getNumHayBales();
        }
        for (Horse myHorse : myHorses) {
            cornAte += myHorse.getNumCorn();
            hayAte += myHorse.getNumHayBales();
        }

        if (cornAte > myNumCorn || hayAte > myNumHayBales) {
            int Cornleft = myNumCorn - cornAte;
            int Hayleft = myNumHayBales - hayAte;
            return false;
        } else if (myNumCorn > cornAte && myNumHayBales > hayAte) {
            myNumCorn -= cornAte;
            myNumHayBales -= hayAte;
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }

    public double cowIncome() {
        double key = 0.0;
        for (int i = 0; i < myCows.size(); i++) {
            key += myCows.get(i).Value();
        }
        return key;
    }


    public double horseIncome() {
        double mon = 0.0;
        for (int i = 0; i < myHorses.size(); i++) {
            mon += myHorses.get(i).Value();
        }
        return mon;
    }

    public double farmIncome() {
        return cowIncome() + horseIncome();
    }

    public int getWeight() {
        int fatty = 0;
        for (Horse horse : myHorses) {
            fatty += horse.getWeight();
        }
        for (Cow cow : myCows) {
            fatty += cow.getWeight();
        }
        return fatty;
    }

    public double getCost() {
        double howmuchfood = 0.0;
        for (int i = 0; i < myCows.size(); i++) {
            howmuchfood += myCows.get(i).getFeedCost(myCornCost, myHayCost);
        }
        for (int i = 0; i < myHorses.size(); i++) {
            howmuchfood += myHorses.get(i).getFeedCost(myCornCost, myHayCost);
        }
        return howmuchfood;
    }

    public ArrayList<Cow> getCows() {
        return myCows;
    }

    public ArrayList<Horse> getHorses() {
        return myHorses;
    }

    public void thisisthecowsnow(ArrayList<Cow> guh) {
        myCows = guh;
    }

    public void thisisthehorsesnow(ArrayList<Horse> guh) {
        myHorses = guh;
    }
}

