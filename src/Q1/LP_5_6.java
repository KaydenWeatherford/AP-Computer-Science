package Q1;
import java.util.Scanner;
import java.lang.Integer;

public class LP_5_6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input 3 integers: ");
        int num = inp.nextInt();
        int sum =0;

        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
            sum += digit;
        }
        System.out.println("The Sum of the Integers are " + sum);
    }
}
/*
Input 3 integers:
892
2
9
8
The Sum of the Integers are 19

 */