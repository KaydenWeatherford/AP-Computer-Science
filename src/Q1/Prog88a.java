package Q1;
import java.util.*;

public class Prog88a {
    public static void main(String[] args){
        // 1-13
        // 2-20
        // Math.random() * (max - min) + min
        int num1 = (int)(Math.random() * (13 - 1) + 1);
        int num2 = (int)(Math.random() * (20 - 2) + 2);
        int max,min;
        if (num1 > num2)
        {
            max = num1;
            min = num2;
        }
        else
        {
            max = num2;
            min = num1;
        }

        int sum = num1 + num2;
        int dif = num1 - num2;
        int abs = Math.abs(dif);
        int prod = num1 * num2;
        int avg = sum/2;


        System.out.println("The original numbers are " + num1 + " and " + num2);
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + dif);
        System.out.println("The product is: " + prod);
        System.out.println("The average is: ");
        System.out.println("The absolute value is: " + abs);
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }
}
