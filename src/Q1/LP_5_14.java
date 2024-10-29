package Q1;
import java.util.*;

public class LP_5_14 {
    public static void main(String[] args) {

        Random rand = new Random();
        int min = 1, max = 6;
        System.out.printf("Roll 1 \t Roll 2 \t Total:\n");
        for (int i = 0; i<5; i++){
            int r1 = rand.nextInt(max - min + 1) + min;
            int r2 = rand.nextInt(max - min + 1) + min;
            int tot = r1 + r2;
            System.out.printf("%d \t\t %d \t\t\t %d\n", r1 ,r2,tot);
        }

    }
}
/*
Roll 1 	 Roll 2 	 Total:
6 		 2 			 8
4 		 4 			 8
4 		 6 			 10
5 		 3 			 8
6 		 2 			 8
 */