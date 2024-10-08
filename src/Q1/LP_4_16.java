package Q1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LP_4_16 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input an angle (In Degrees)");
        double angle = Math.toRadians(inp.nextDouble());


        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        double tan = Math.tan(angle);

        System.out.println("The Sin of the Angle: " + sin);
        System.out.println("The Cos of the Angle: " + cos);
        System.out.println("The Tan of the Angle: " + tan);
    }

}
/*
30
The Sin of the Angle: 0.49999999999999994
The Cos of the Angle: 0.8660254037844387
The Tan of the Angle: 0.5773502691896257
 */