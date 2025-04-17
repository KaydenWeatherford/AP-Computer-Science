package Q4.MSOE;

import java.util.Scanner;

public class MSOE_2021_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter:");
        char c = sc.nextLine().charAt(0);
        char space = ' ';
        System.out.println("Enter the text:");
        String text = sc.nextLine().toLowerCase() + " ";
        String temp = "";

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == space && text.charAt(i - 1) == c) {
                int j = i - 1;
                while ((!(text.charAt(j) == (' '))) && j > 0) {
                    j--;
                }
                if (j == 0) {
                    temp = text.substring(j, i);
                } else {
                    temp = text.substring(j + 1, i);
                }

                System.out.println(temp);
                break;
            }
        }
        if (temp.equals("")) {
            System.out.println("Not found");
        }
    }
}
