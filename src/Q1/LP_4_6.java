package Q1;
import java.util.Scanner;
import java.util.Random;

public class LP_4_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);

        int min = 2, max = 20;
        int num1 = rand.nextInt(max - min + 1) + min;
        int num2 = rand.nextInt(max - min + 1) + min;
        int ans = num1 * num2;

        System.out.println("What is " + num1 + " * " + num2+"?");
        int guess = inp.nextInt();

        if (guess == ans){
            System.out.println("That's Correct!!!");
        }
        else {
            System.out.println("You're a failure");
        }

    }
}
/*
What is 3 * 4?
12
That's Correct!!!
 */