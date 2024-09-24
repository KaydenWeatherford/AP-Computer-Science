package Q1;
import java.lang.Math;

public class Prog122c {
    public static void main(String[] args) {

        int e = 0;
        int o = 1;
        int f = 0;
        int sqr;

        for (int i = 0; i < 5; i++)
        {
            e +=2;
            o +=2;
            f +=4;
            sqr = (int)Math.pow(e,2);
            System.out.println(e + "   " + o + "   " + f + "   " + sqr);
        }
    }
}
/*
2   3   4   4
4   5   8   16
6   7   12   36
8   9   16   64
10   11   20   100
 */
