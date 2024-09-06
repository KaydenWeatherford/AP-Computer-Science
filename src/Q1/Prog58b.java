package Q1;
import java.util.*;
import java.lang.Math;

public class Prog58b {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.println("Input A, B, and C\n");
        double a = inp.nextDouble(), b = inp.nextDouble(), c = inp.nextDouble();
        double root1 = (     (-b + (Math.sqrt( Math.pow(b,2) - (4*a*c) ))) / (2.0 * a)      );
        double root2 = (     (-b - (Math.sqrt( Math.pow(b,2) - (4*a*c) ))) / (2.0 * a)      );

        System.out.print("The 2 roots are: " + root1 + " and " + root2);

    }
}
/*
Input A, B, and C

1
1
-2
The 2 roots are: 1.0 and -2.0
 */