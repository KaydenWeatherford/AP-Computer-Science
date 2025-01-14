package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog470c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));

            // 6 arrays of length 6
            int[][] mat = new int[6][6];

            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length - 1; c++) {
                    mat[r][c] = file.nextInt();
                }
            }

            System.out.println("Original: ");
            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length - 1; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

            System.out.println();
            // Find sum
            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length - 1; c++) {
                    mat[r][5] += mat[r][c];
                    mat[5][r] += mat[r][c];
                    mat[5][5] += mat[r][c];
                }
            }

            System.out.println("New Matrix: ");
            // Print
            for (int[] row : mat) {
                for (int num : row) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Original:
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

New Matrix:
45	67	89	12	-3	210
-3	-6	-7	-4	-9	-29
96	81	-8	52	12	233
14	-7	72	29	-1	107
19	43	28	63	87	240
210	-29	233	107	240	761

Process finished with exit code 0

 */