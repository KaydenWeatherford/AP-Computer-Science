package Q3.Farm;

public abstract class Animal {
    private final String myname;
    private final int myweight;
    private final int myNumCorn;
    private final int myNumHayBales;

    public Animal(String name, int weight, int corn, int hay) {
        myname = name;
        myweight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }

    public abstract double Value(double cornCost, double hayCost);

    public String getName() {
        return myname;
    }

    public int getWeight() {
        return myweight;
    }

    public int getNumCorn() {
        return myNumCorn;
    }

    public int getNumHayBales() {
        return myNumHayBales;
    }

    public double getFeedCost(double cornCost, double hayCost) {
        return (myNumCorn * cornCost) + (myNumHayBales * hayCost);
    }

}
