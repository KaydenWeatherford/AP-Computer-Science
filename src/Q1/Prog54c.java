package Q1;
import java.util.*;
import java.lang.Math;

public class Prog54c {
    public static void main(String[] args){
        double r, pi = 3.14159;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        r = inp.nextDouble();

        double circ = (2 * pi) * r;
        System.out.println("The circumference of the circle is: " + circ);

        double area = pi * Math.pow(r, 2);
        System.out.printf("The area of the circle is: %.3f" + area);

        /*
        Enter the Radius: 3.712
        The circumference of the circle is: 23.32316416
        The area of the circle is: 43.28779268096
         */

    }
}
