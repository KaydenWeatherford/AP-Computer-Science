package Q1;

import java.util.Arrays;

public class Prog166e {
    public static void main(String[] args) {
        int a = 0, b = 1, i;
        double frac;

        while (a < 16 && b <= 15) {
            a += 1;
            if (a == b){
                b++;
                if (a != 15){
                    a = 1;
                }
            }
            frac = (double)a / b;
            System.out.printf("%d/%d\t\t%.5f\n", a, b, frac);

        }








    }
}
