package Q1;
import java.util.Scanner;

public class LP_5_6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input 3 integers: ");
        String str = inp.nextLine();

        int one = Integer.valueOf(str.substring(0, 1));
        int two = Integer.valueOf(str.substring(1, 2));
        int three = Integer.valueOf(str.substring(2, 3));

        int sum = one + two + three;
        System.out.println("The Sum of the Integers are " + sum);
    }
}
/*
Input 3 integers:
123
The Sum of the Integers are 6

 */