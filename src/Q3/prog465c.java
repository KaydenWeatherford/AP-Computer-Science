package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.txt"));

            int[][] mat = new int[file.nextInt()][file.nextInt()];
            int cnt = 0;

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = file.nextInt();
                }
            }

            System.out.println("Original Matrix: ");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            int sum = 0;
            for (int r = 0; r < mat.length; r++) {
                if (r == 0 || r == mat.length - 1) {
                    for (int c = 0; c < mat[0].length; c++) {
                        sum += mat[r][c];
                    }
                } else {
                    sum += mat[r][0] + mat[r][mat[r].length - 1];
                }
            }

            System.out.println("The total is: " + sum);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
/*
Original Matrix:
100 195 182 225
83 125 235 67
129 42 100 750
The total is: 1873

 */