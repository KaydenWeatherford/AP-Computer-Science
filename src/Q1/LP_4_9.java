package Q1;
import java.util.*;

public class LP_4_9 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);

        int min = 1, max = 20;
        int SN = rand.nextInt(max - min + 1) + min;

        System.out.println("Guess a number between 1-20");
        int guess = inp.nextInt();

        if (guess > 20 || guess < 1){
            System.out.println("I think you're dumb.");
        }
        else if (guess == SN){
            System.out.println("YAY YOU WERE CORRECT!!!!!!");
        }
        else {
            System.out.println("Nope, the secret number was: " + SN);
        }
    }
}
/*
Guess a number between 1-20
7
Nope, the secret number was: 15
 */