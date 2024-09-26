package Q1;
import java.util.Scanner;

public class LP_4_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of paper copies: ");
        int copy = inp.nextInt();
        double total = 0.00;

        if (copy <= 0){
            System.out.println("Cant print lsr");
        }
        else if(copy < 100){
            total = copy * 0.30;
            System.out.println("Price per copy is $0.30");
            System.out.println("Total cost is: $" + total);
        }
        else if (copy < 500){
            total = copy * 0.28;
            System.out.println("Price per copy is $0.28");
            System.out.println("Total cost is: $" + total);
        }
        else if (copy < 750){
            total = copy * 0.27;
            System.out.println("Price per copy is $0.27");
            System.out.println("Total cost is: $" + total);
        }
        else if (copy < 1001){
            total = copy * 0.26;
            System.out.println("Price per copy is $0.26");
            System.out.println("Total cost is: $" + total);
        }
        else {
            total = copy * 0.25;
            System.out.println("Price per copy is $0.25");
            System.out.println("Total cost is: $" + total);
        }

    }
}
/*
Enter the number of paper copies:
1001
Price per copy is $0.25
Total cost is: 250.25

 */