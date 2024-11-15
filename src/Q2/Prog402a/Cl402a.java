package Q2.Prog402a;

public class Cl402a {
    private double mAvg = 0.0;
    private int[] mID = new int[100];
    private int[] mScore = new int[100];


    public Cl402a(int[] id, int[] score) {
        mID = id;
        mScore = score;
    }

    public void calc() {
        int cnt = mID.length;
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += mScore[i];
        }
        mAvg = (double) sum / cnt;
    }

    public void output(int cnt) {
        System.out.print("ID\t\tScore\t\t\tDifference\n");
        for (int i = 0; i < cnt; i++) {
            System.out.printf("%d\t\t%d\t\t\t%.2f\n", mID[i], mScore[i], (mScore[i] - mAvg));
        }
    }
}
