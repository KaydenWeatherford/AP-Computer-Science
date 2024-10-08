package Q1;
import java.util.Scanner;
public class LP_4_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input dimensions of package (cm): ");

        int len = inp.nextInt();
        int wid = inp.nextInt();
        int high = inp.nextInt();
        int size = len * wid * high;
        System.out.println("Now enter weight (kg): ");
        int weight = inp.nextInt();

        if (weight > 27 && size > 100000){
            System.out.println("TOO HEAVY AND TOO BIG!!!!!");
        }
        else if (size > 100000){
            System.out.println("TOO BIG!!!");
        }
        else if (weight > 27){
            System.out.println("TOO HEAVY!!");
        }
        else {
            System.out.println("It's fine");
        }
    }
}
