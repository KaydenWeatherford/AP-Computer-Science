package Q1;
import java.util.*;
public class Prog58t {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        double price = (int)(Math.random() * (15000 - 5000) + 5000);
        price = price/100;
        System.out.printf("Your total is: %.2f", price);
        System.out.printf("\nInsert Cash \n(How much are you paying?)");
        double pay = inp.nextDouble();
        System.out.println("You payed: " + pay);
        price = price * 100;
        pay = pay*100;
        if (pay < price)
        {
            System.out.println("Thats not enough money! You need " + (price - pay) + " more.");
        }
        else if (pay == price)
        {
            System.out.println("Your change left is $0.00, Thank you for shopping!");
        }
        else
        {
            int change = (int)pay - (int)price;
            int dol = 0, qrt = 0, dime = 0, nic = 0, pen = 0;
            while ( change >= 100)
            {
                change = change - 100;
                dol++;
            }
            while (change >= 25)
            {
                change = change - 25;
                qrt++;
            }
            while (change >= 10)
            {
                change = change - 10;
                dime++;
            }
            while (change >= 5)
            {
                change = change - 5;
                nic++;
            }
            while (change >= 1)
            {
                change = change - 1;
                pen++;
            }


            System.out.println("\n----------");
            System.out.printf("The total dollars back:  " + dol);
            System.out.printf("\nThe total quarters back: " + qrt);
            System.out.printf("\nThe total dimes back:    " + dime);
            System.out.printf("\nThe total nickles back:  " + nic);
            System.out.printf("\nThe total pennies back:  " + pen);
            System.out.println("\n----------");
        }
    }
}
/*
Your total is: 100.89
Insert Cash
(How much are you paying?)101
You payed: 101.0

----------
The total dollars back:  0
The total quarters back: 0
The total dimes back:    1
The total nickles back:  0
The total pennies back:  1
----------
 */