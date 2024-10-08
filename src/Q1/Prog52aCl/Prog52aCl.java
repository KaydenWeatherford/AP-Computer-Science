package Q1.Prog52aCl;
import java.util.Scanner;

public class Prog52aCl {
    public static void main(String[] args) {
        // Input
        Scanner inp = new Scanner(System.in);
        System.out.println("Input Length");
        int len = inp.nextInt();
        System.out.println("Input width");
        int wid = inp.nextInt();

        // Calculations

        Cl52a wow = new Cl52a(len, wid);
        wow.calc();
        int area = wow.getArea();
        int perim = wow.getPerim();


        // Output
        System.out.println("The Perimeter is: " + perim);
        System.out.println("The Area is: " + area);
    }
}
/*
Input Length
5
Input width
5
The Perimeter is: 20
The Area is: 25

 */