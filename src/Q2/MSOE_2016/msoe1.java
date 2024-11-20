package Q2.MSOE_2016;

import java.util.Scanner;

public class msoe1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String newstr = "";
        Character temp;
        boolean pal = false;
        int cnt = 0;

        System.out.println("Please input a lowercase string.");
        String str = inp.nextLine();

        for (int i = str.length(); i > str.length() / 2; i--) {
            temp = str.charAt(i - 1);
            newstr = newstr + temp;
        }

        if (str.substring(0, str.length() / 2).equals(newstr)) {
            pal = true;
        } else if (str.substring(0, (str.length() / 2) + 1).equals(newstr)) {
            pal = true;
        }
        System.out.println(str + " is a Palindrome: " + pal);
    }
}
