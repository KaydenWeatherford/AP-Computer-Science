package Q2.Prog214c;

public class ILOVEDRINKINGGASOLINE {
    private final String myType;
    private final double myGal;
    private final String myCW;

    public ILOVEDRINKINGGASOLINE(String Type, double gal, String CW) {
        myType = Type;
        myGal = gal;
        myCW = CW;
    }

    public double gasPrice() {
        double price = 0;


        if (myType.equals("R")) {
            price = 1.359;
        } else if (myType.equals("P")) {
            price = 1.479;
        } else if (myType.equals("H")) {
            price = 1.429;
        }
        double total = price * myGal;
        return total;
    }

    public double CarWashPrice() {
        double cwprice = 2;
        double discount = 1;
        if (myCW.equals("Y")) {
            if (myGal <= 10) {
                return cwprice;
            }
            if (myGal > 10 && myGal <= 20) {
                double temp = ((int) myGal - 10) / 10;
                discount -= temp;
                cwprice *= discount;
                return cwprice;
            }
            if (myGal > 20) {
                cwprice = 0;
                return cwprice;
            }
        }
        return 0;
    }

    public String getType() {
        return myType;
    }

    public double getGallons() {
        return myGal;
    }

    public String getCarWash() {
        return myCW;
    }


}
