package Q1;
import java.util.*;

public class Prog54b {
    public static void main(String[] args){
        int v1, v2, v3, v4, sum;
        double avg;
        Scanner inp = new Scanner(System.in);

        System.out.print("Input the first number: ");
        v1 = inp.nextInt();
        System.out.print("Input the second number: ");
        v2 = inp.nextInt();
        System.out.print("Input the third number: ");
        v3 = inp.nextInt();
        System.out.print("Input the fourth number: ");
        v4 = inp.nextInt();

        sum = v1 + v2 + v3 + v4;
        System.out.println("The sum of all 4 numbers is: " + sum);

        avg = (double)sum / 4;
        System.out.println("The average of the 4 numbers is: " + avg);

        /*
        Input the first number: 475
    Input the second number: 821
    Input the third number: 369
    Input the fourth number: 562
    The sum of all 4 numbers is: 2227
    The average of the 4 numbers is: 556.75
         */


    }
}
