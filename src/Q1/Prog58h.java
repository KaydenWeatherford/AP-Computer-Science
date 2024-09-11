package Q1;
import java.util.*;
import java.lang.Math;

public class Prog58h {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.print("Input Amount: ");
        int a = inp.nextInt();

        System.out.print("Input Rate: ");
        double r = inp.nextDouble();

        System.out.print("Input Time: ");
        double t = inp.nextDouble();

        double total;
        double n = 365;
        // A = P(1 + r/n)^nt
        total = a * Math.pow((1+((r * 0.01)/360)),((n * t)/n));

        System.out.println("The original amount is: " + a);
        System.out.println("The rate was: " + r);
        System.out.println("The total amount of days: " + t);
        System.out.printf("The total is: %.2f",total);


        /*
        The original amount is: 5000
        The rate was: 11.5
        The total amount of days: 900.0
        The total is: 6665.15
         */





    }
}
