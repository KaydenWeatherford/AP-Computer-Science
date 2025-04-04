package Q3.Farm;

public class Cow extends Animal {
    private static double MILK_PRICE_LB = 0.20;
    private int myMilk;

    public Cow(String name, int weight, int milk, int corn, int hay) {
        super(name, weight, corn, hay);
        myMilk = milk;

    }


    public double Value() {
        return (myMilk * MILK_PRICE_LB);
    }

    public double getMilk() {
        return myMilk;
    }

    public double getMilkPrice() {
        return MILK_PRICE_LB;
    }

    public void setMilkLBS(int milkLBS) {
        myMilk = milkLBS;
    }
}
