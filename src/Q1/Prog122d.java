package Q1;
import java.lang.Math;

public class Prog122d {
    public static long func(int x){
        long y = ((long)Math.pow(x,6))
                - (3 * ((long)Math.pow(x,5)))
                - (93 * ((long)Math.pow(x,4)))
                + (87 * ((long)Math.pow(x,3)))
                + (1596 * ((long)Math.pow(x,2)))
                - ((long)1380*x) - 2800;
        return y;
    }
    public static void main(String[] args) {
        System.out.println("X               Y");
        for (int i = -12; i < 17; i++)
        {
            int x = i;
            long y = func(x);
            System.out.println(x + "               " + y);
        }
    }
}
/*
X               Y
-12               1897280
-11               982800
-10               453600
-9               173888
-8               45360
-7               0
-6               -6400
-5               0
-4               6048
-3               7280
-2               4320
-1               0
0               -2800
1               -2592
2               0
3               2240
4               0
5               -10800
6               -32032
7               -60480
8               -84240
9               -78400
10               0
11               217728
12               671840
13               1496880
14               2872800
15               5033600
16               8276688

Process finished with exit code 0

 */