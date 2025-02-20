package Q3.prog703s;

public class OS implements comps {
    private final String myName;
    private final int myNum;
    private final double myVal;

    public OS(String name, int num, double val) {
        myName = name;
        myNum = num;
        myVal = val;
    }

    public String getName() {
        return myName;
    }


    public int getNumber() {
        return myNum;
    }

    public double getValue() {
        return myVal;
    }
}
