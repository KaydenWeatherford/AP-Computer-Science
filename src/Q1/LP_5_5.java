package Q1;
import java.util.Scanner;

public class LP_5_5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input 3 integers: ");
        String str = inp.nextLine();

        String one = str.substring(0,1);
        String two = str.substring(1,2);
        String three = str.substring(2,3);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
/*
Input 3 integers:
123
1
2
3

 */