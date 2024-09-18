package Q1;
import java.util.*;
import java.lang.Math;

public class Prog76a {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = inp.nextInt();
        int num2 = num * 9;
        System.out.println(num + " * 9 = " + num2);
        System.out.println("----------");
        num = num2;
        num2 = num * 12345679;
        System.out.println(num + " * 12345679 = " + num2);
        System.out.println("Boom, All numbr");



    }
}
/*
Enter a number:
5
5 * 9 = 45
----------
45 * 12345679 = 555555555
Boom, All numbr
 */