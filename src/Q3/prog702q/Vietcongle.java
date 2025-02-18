package Q3.prog702q;

public class Vietcongle implements names {
    private final String myName;
    private final int myTires;
    private final double myValueColonThree;

    public Vietcongle(String name, int tires, double val) {
        myName = name;
        myTires = tires;
        myValueColonThree = val;

    }

    public String getName() {
        return myName;
    }

    public int getTire() {
        return myTires;
    }

    public double getValue() {
        return myValueColonThree;
    }
}
