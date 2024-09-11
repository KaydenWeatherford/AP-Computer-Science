package Q1;
import java.util.*;
import java.lang.Math;

public class MathTest {
    public static void main(String[] args){
        int twocubed = (int)Math.pow(2, 3);

        int num1 = 5, num2 = 6, num3 = 7;
        int sum = num1 + num2 + num3;
        double average = (double)sum / 3;

        int test = 3/4; // = 0

        double mywallet = 5432.5432932423423324287123432;
        double mywalletrounded = Math.round(mywallet * 100.0) / 100.0;
        System.out.println(mywalletrounded);
        System.out.printf("mywalletrounded = %.2f\n", mywallet );


    }
}
