package Q1;
import java.util.*;

public class Prog58i {
    public static void main(String[] args){
        Scanner guh = new Scanner(System.in);

        System.out.print("The amount I wish to borrow is $");
        double p = guh.nextDouble();

        System.out.print("The loan rate is: ");
        double r = guh.nextDouble();

        System.out.print("Number of Month to pay off: ");
        double m = guh.nextDouble();

        double r_over_1200 = r/1200;

        double mp = p * r_over_1200 * (Math.pow((1 + r_over_1200),m)
                                                    /
                                      (Math.pow(1+r_over_1200, m) - 1));

        double totinterest = mp * m;

        System.out.printf("My monthly payments will be $%.2f\n", mp);
        System.out.printf("The total interest paid is $%.2f\n", totinterest);
        System.out.printf("The total amount paid is $%.2f\n", totinterest + p);



        /*
        The amount I wish to borrow is $7500
        The loan rate is: 14.5
        Number of Month to pay off: 36
        My monthly payments will be $258.16
        The total interest paid is $9293.66
        The total amount paid is $16793.66

         */



    }
}
