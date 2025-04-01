package Q3.Farm;

public abstract class Animal {
    private String myname;
    private int myweight;
    private int myNumCorn;
    private int myNumHayBales;

    public Animal(String name, int weight, int corn, int hay) {
        myname = name;
        myweight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }

    public abstract double Value();

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

    public void setWeight(int weightz) {
        myweight = weightz;
    }

    public void setNumCorn(int cornz) {
        myNumCorn = cornz;
    }

    public void setNumHayBales(int balez) {
        myNumHayBales = balez;
    }

}
