package Q1;
import java.util.Scanner;
public class Prog166f {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = 100;
        for (int lcv = 100; lcv < 111; lcv++){
            System.out.println("The sum of the numbers from 1 to " + n + " is " + sum(1,lcv));
        }

    }

    public static int sum(int num,int n){
        int sum = 0;
        for (int lcv = num; lcv < n + 1; lcv++){
            sum += lcv;
        }
        return sum;
    }
}

/*
The sum of the numbers from 1 to 100 is 5050
The sum of the numbers from 1 to 100 is 5151
The sum of the numbers from 1 to 100 is 5253
The sum of the numbers from 1 to 100 is 5356
The sum of the numbers from 1 to 100 is 5460
The sum of the numbers from 1 to 100 is 5565
The sum of the numbers from 1 to 100 is 5671
The sum of the numbers from 1 to 100 is 5778
The sum of the numbers from 1 to 100 is 5886
The sum of the numbers from 1 to 100 is 5995
The sum of the numbers from 1 to 100 is 6105
 */
