package Q2.Prog435a;

public class Cl435a {
    private String[] mfac = new String[100];
    private double[] mty = new double[100];
    private double[] mtotal = new double[100];
    private double[] mprice = new double[100];
    private int[] mtype = new int[100];
    private int[] mgate = new int[100];


    public Cl435a(String[] fac, double[] ty, double[] total, double[] price, int[] type, int[] gate) {
        mfac = fac;
        mty = ty;
        mtotal = total;
        mprice = price;
        mtype = type;
        mgate = gate;
    }


    public void calc() {
        int cnt = mtype.length;
        for (int i = 0; i < cnt; i++) {
            if (mtype[i] == 1) {
                mfac[i] = "Compact Car";
                mty[i] = 1.0;
            } else if (mtype[i] == 2) {
                mfac[i] = "Small Car";
                mty[i] = 1.3;
            } else if (mtype[i] == 3) {
                mfac[i] = "Mid Size Car";
                mty[i] = 1.6;
            } else if (mtype[i] == 4) {
                mfac[i] = "Full size Car";
                mty[i] = 2.0;
            } else if (mtype[i] == 5) {
                mfac[i] = "Truck";
                mty[i] = 2.4;
            } else if (mtype[i] == 6) {
                mfac[i] = "16 Wheeler";
                mty[i] = 2.7;
            }
            if (mgate[i] == 1) {
                mprice[i] = 1.35;
            } else if (mgate[i] == 2) {
                mprice[i] = 2.00;
            } else if (mgate[i] == 3) {
                mprice[i] = 2.50;
            } else if (mgate[i] == 4) {
                mprice[i] = 3.25;
            } else if (mgate[i] == 5) {
                mprice[i] = 4.10;
            } else if (mgate[i] == 6) {
                mprice[i] = 4.80;
            } else if (mgate[i] == 7) {
                mprice[i] = 5.50;
            } else if (mgate[i] == 8) {
                mprice[i] = 6.00;
            }
            mtotal[i] = mprice[i] * mty[i];
        }
    }

    public String[] getFac() {
        return mfac;
    }

    public double[] getTy() {
        return mty;
    }

    public double[] getTotal() {
        return mtotal;
    }

    public double[] getPrice() {
        return mprice;
    }

    public int[] getType() {
        return mtype;
    }

    public int[] getGate() {
        return mgate;
    }

    public void toString(int cnt) {
        System.out.printf("Car Type\t\tBase Toll\t\tFactor\t\tCost\n");
        for (int i = 0; i < cnt; i++) {
            System.out.printf("%s\t\t\t\t%.2f\t\t\t\t%.2f\t\t\t\t%.2f\n", mfac[i], mprice[i], mty[i], mtotal[i]);
        }
    }
}
