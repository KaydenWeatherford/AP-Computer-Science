package Q2.Prog602b;

public class InternetCustomer {
    private final int myAcc;
    private final double myHours;
    private final int myCode;
    private double myCharge;

    public InternetCustomer(int acc, double hours, int code) {
        myAcc = acc;
        myHours = hours;
        myCode = code;
        myCharge = 0;
    }

    public void setCharge() {
        double surCharge = 0;
        if (myCode == 1) surCharge = 50;
        if (myCode == 2) surCharge = 150;

        // TODO Calc
        if (myHours < 5) {
            myCharge += 200;
        } else if (myHours < 15) {
            double guh = myHours % 1;
            guh *= 50;
            myCharge += 200 + guh;
            myCharge += ((int) myHours - 5) * 50;
        } else if (myHours > 15) {
            double guh = myHours % 1;
            guh *= 30;
            myCharge += 550 + guh;
            myCharge += ((int) myHours - 15) * 30;
        }

        myCharge += surCharge;
    }

    public int getAcc() {
        return myAcc;
    }

    public double getHours() {
        return myHours;
    }

    public int getCode() {
        return myCode;
    }

    public double getCharge() {
        return myCharge;
    }


}
