package Q1.Prog93aCl;

public class Cl93a {
    private int kwh;
    private double baseRate;
    private double surcharge;
    private double cityTax;
    private double total;
    private double lateTotal;

    public Cl93a(int kwh){
        this.kwh = kwh;
        baseRate = 0;
        surcharge = 0;
        cityTax = 0;
        total = 0;
        lateTotal = 0;
    }


    public void calc() {
        baseRate = 0.0475;
        double subtot = kwh * baseRate;
        subtot = subtot * 100;
        subtot = Math.round(subtot);
        subtot = subtot / 100;
        double temp = subtot * 10;
        surcharge = ((double)Math.round(temp)) / 100;
        cityTax = (double)Math.round((subtot * 0.03)*100) / 100;
        total = subtot + surcharge + cityTax;
        lateTotal = (double)Math.round((total * 1.04)*100)/ 100;
    }

    public String toString() {
        return "KWH Used: " + kwh +
                "\nBase Rate: " + baseRate +
                "\nSurcharge: " + surcharge +
                "\nCity Tax: " + cityTax +
                "\nTotal: " + total +
                "\nLate Total: " + lateTotal;
    }
}
