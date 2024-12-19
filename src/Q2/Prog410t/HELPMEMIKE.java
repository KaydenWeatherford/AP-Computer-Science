package Q2.Prog410t;

public class HELPMEMIKE {
    private final int myid;
    private final int myincome;
    private final int mypeople;

    public HELPMEMIKE(int id, int income, int people) {
        myid = id;
        myincome = income;
        mypeople = people;
    }

    public int getID() {
        return myid;
    }

    public int getIncome() {
        return myincome;
    }

    public int getMembers() {
        return mypeople;
    }

    public int getPoverty() {
        int poverty = 3750 + 750 * (mypeople - 2);
        return poverty;
    }
}
