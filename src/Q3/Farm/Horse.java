package Q3.Farm;

public class Horse extends Animal {
    private final int myNumRides;
    private final double myRideCost;

    public Horse(String name, int weight, int corn, int hay, int rides, double cost) {
        super(name, weight, corn, hay);
        myNumRides = rides;
        myRideCost = cost;
    }

    public double Value() {
        return (myNumRides * myRideCost);
    }

    @Override
    public String getName() {
        return super.getName() + super.getName();
    }

    public int getRides() {
        return myNumRides;
    }

    public double getRideCost() {
        return myRideCost;
    }


}
