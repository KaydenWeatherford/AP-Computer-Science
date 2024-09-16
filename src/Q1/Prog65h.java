package Q1;
import java.util.*;
import java.lang.Math;

public class Prog65h {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter pounds: ");
        double pou = inp.nextInt();
        System.out.println("Enter shillings: ");
        double sh = inp.nextInt() * 0.05;
        System.out.println("Enter pence: ");
        double pen = inp.nextInt();

        while (pen >= 12){
            pen -= 12;
            sh += 0.2;
        }
        while (sh >= 1){
            sh -= 1;
            pou += 1;
        }

        double pent = (double)Math.round(((pen * 0.0041667) * 100)) / 100;
        double total = pou + sh + pent;

        System.out.println("Decimal pounds = " + total);

    }
}

/*
Enter pounds:
7
Enter shillings:
17
Enter pence:
9
Decimal pounds = 7.89

 */