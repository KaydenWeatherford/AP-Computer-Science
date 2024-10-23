package Q1;

public class LP_5_9 {
    public static void main(String[] args) {
        for (int i = 1; i < 7;i++ ){
            int sqr = (int)Math.pow(i, 2);
            int cube = (int)Math.pow(i, 3);
            int four = (int)Math.pow(i,4);
            int fiv = (int)Math.pow(i,5);
            System.out.printf("%d\t%d\t%d\t%d\t%d\n", i, sqr, cube,four, fiv);
        }

    }
}
/*
1	1	1	1	1
2	4	8	16	32
3	9	27	81	243
4	16	64	256	1024
5	25	125	625	3125
6	36	216	1296	7776
 */