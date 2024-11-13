package Q2.Cl213fArray;

public class Cl213f {
    private double myKwh;
    private double myCost;

    public Cl213f(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }

    public void calc(){
        if      (myKwh <= 2000)     myCost = (myKwh * 0.07);
        else if (myKwh <= 10000)    myCost = ((myKwh - 2000) * 0.05) + 140;
        else if (myKwh > 10000)     myCost = ((myKwh - 10000) * 0.04) + 540;
    }

    // public String toString(){
    //     String.format();
    // }


}
