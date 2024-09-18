package Q1;
import java.util.*; import java.lang.Math;

public class Prog82a {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter speed limit: ");
        int limit = inp.nextInt();
        System.out.println("Input the speed:");
        int speed = inp.nextInt();


        if (speed > limit){
            int temp = speed - limit;
            int fine = 20 + (temp * 5);

            System.out.println("----------");
            System.out.println("The fine is: $" + fine + (".00"));

        }

    }
}
/*
Input the speed:
42
Enter speed limit:
30
----------
The fine is: $80.00
 */