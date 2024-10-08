package Q1;
import java.util.Scanner;
public class LP_4_3 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("How many eggs you gonna buy? ");
        int eggs = inp.nextInt();
        int dozens = eggs / 12;
        double rem = eggs % 12;
        double price = 0; double total =0;


        if (eggs < 0){
            System.out.println("no");
        }
        else if (eggs < 49){
        price = 0.5;
        total = dozens * price;
        rem = (price/12) * rem;
        total += rem;
        total = (double) Math.round(total * 100) / 100;
        }
        else if (eggs < 73){
            price = 0.45;
            total = dozens * price;
            rem = (price/12) * rem;
            total += rem;
            total = (double) Math.round(total * 100) / 100;
        }
        else if (eggs < 122){
            price = 0.4;
            total = dozens * price;
            rem = (price/12) * rem;
            total += rem;
            total = (double) Math.round(total * 100) / 100;
        }
        else {
            price = 0.35;
            total = dozens * price;
            rem = (price/12) * rem;
            total += rem;
            total = (double) Math.round(total * 100) / 100;
        }

        System.out.println("Total amount of Eggs: " + eggs);
        System.out.println("The bill is: " + total);
    }
}
/*
How many eggs you gonna buy?
18
Total amount of Eggs: 18
The bill is: 0.75
 */