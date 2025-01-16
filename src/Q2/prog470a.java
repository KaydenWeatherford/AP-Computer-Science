package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog470a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[6][5];

            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = file.nextInt();
                }
            }

            System.out.println("Original: ");
            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            // Finding sum :3
            for (int r = 0; r < mat.length - 1; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[5][c] += mat[r][c];
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
45	67	89	12	-3
-3	-6	-7	-4	-9
96	81	-8	52	12
14	-7	72	29	-1
19	43	28	63	87
171	178	174	152	86
 */