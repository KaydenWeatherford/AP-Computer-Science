package Q2.MSOE_2016;

import java.util.Scanner;

public class msoe2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter length of side A: ");
        double sideA = inp.nextDouble();
        System.out.println("Enter length of side C: ");
        double sideC = inp.nextDouble();
        System.out.println("Enter angle A: ");
        double angleA = inp.nextDouble();

        double angleC = Math.sin(sideC) / (Math.sin(sideA) / angleA);

        System.out.printf("The degree angle of c is %.2f", angleC);
    }
}
/*
Enter length of side A:
10
Enter length of side C:
10
Enter angle A:
45
The degree angle of c is 45.00
Process finished with exit code 0

 */