package Q2.Prog213v;

public class Transaction {
    private final String myType;
    private final double myAmount;

    public Transaction(String type, double amount) {
        myType = type;
        myAmount = amount;
    }

    public String getCode() {
        return myType;
    }

    public double getAmount() {
        return myAmount;
    }


}
