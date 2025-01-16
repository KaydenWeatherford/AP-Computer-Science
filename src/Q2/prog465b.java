package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] mat = new int[3][4];
            int cnt = 0;

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = file.nextInt();
                }
            }

            System.out.println("Original Matrix: ");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    if (mat[r][c] < 100) {
                        cnt++;
                    }
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

            int[][] other = new int[cnt][2];
            int i = 0;
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    if (mat[r][c] < 100) {
                        int j = 0;
                        other[i][j] = r + 1;
                        j++;
                        other[i][j] = c + 1;
                        i++;
                    }
                }
            }

            System.out.println("Output Matrix: ");
            for (int r = 0; r < other.length; r++) {
                for (int c = 0; c < other[0].length; c++) {
                    System.out.print(other[r][c] + " ");
                }
                System.out.println();
            }


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
Output Matrix:
2 1
2 4
3 2
 */
