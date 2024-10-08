package Q1;

import java.util.Scanner;

public class LP_4_10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int len = 0, wid = 0, hig = 0;

        System.out.println("Enter the Length: ");
        len = inp.nextInt();
        System.out.println("Enter the Width: ");
        wid = inp.nextInt();
        System.out.println("Enter the Height: ");
        hig = inp.nextInt();

        int prism = len * wid * hig;
        System.out.println("The volume of a prism is: " + prism);

        System.out.println("Enter the radius: ");
        int r = inp.nextInt();

        double sphere = ((double)4/3 * 3.1416) * (Math.pow(r,3));
        System.out.println("The volume of a sphere is: " + sphere);

        System.out.println("Enter the length of a side of a cube: ");
        int side = inp.nextInt();
        int cube = side * side * side;
        System.out.println("The Area of a Cube is: " + cube);


    }
}
/*
Enter the Length:
3
Enter the Width:
4
Enter the Height:
5
The volume of a prism is: 60
Enter the radius:
3
The volume of a sphere is: 113.09759999999999
Enter the length of a side of a cube:
4
The Area of a Cube is: 64
 */