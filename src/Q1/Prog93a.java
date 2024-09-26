package Q1;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Prog93a {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("How many Kilowatts did you use?");
        int kw = inp.nextInt();
        double subtot = kw * 0.0475;
        subtot = subtot * 100;
        subtot = Math.round(subtot);
        subtot = subtot / 100;
        double temp = subtot * 10;
        double util = ((double)Math.round(temp)) / 100;
        double city = (double)Math.round((subtot * 0.03)*100) / 100;
        double total = subtot + util + city;
        double late = (double)Math.round((total * 1.04)*100)/ 100;



        System.out.println("----------");
        System.out.println("You used " + kw + " Kilowatts");
        System.out.println("----------");
        System.out.println("Base rate = " + kw + " @ $0.0475 = $"+ subtot);
        System.out.println("Surcharge = $" + util);
        System.out.println("City Tax  = $" + city);
        System.out.println("----------");
        System.out.println("Total Due = $" + total);
        System.out.println("After May 20th = " + late);



    }
}
/*
How many Kilowatts did you use?
993
----------
You used 993 Kilowatts
----------
Base rate = 993 @ $0.0475 = $47.17
Surcharge = $4.72
City Tax  = $1.42
----------
Total Due = $53.31
After May 20th = 55.44

 */