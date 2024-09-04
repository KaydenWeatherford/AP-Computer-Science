package Q1;
import java.util.*;

public class Prog52aInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Length: ");
        int len = input.nextInt();
        System.out.println();

        System.out.print("Please enter Width: ");
        int wid = input.nextInt();
        System.out.println();

        int area = len * wid, perim = (len * 2) + (wid * 2);
        System.out.println("Area = " + area); System.out.println("Width = " + wid);

    }
}
/*
Please Enter Length: 10

Please enter Width: 5

Area = 50
Width = 5

 */