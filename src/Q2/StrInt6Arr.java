package Q2;

import java.util.Scanner;

public class StrInt6Arr {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = inp.nextLine().toUpperCase();

        String ab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] cnt = new int[26];

        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < ab.length(); j++)
                if (str.substring(i, i + 1).equals(ab.substring(j, j + 1)))
                    cnt[j]++;

        int unique = 0;
        for (int n : cnt)
            if (n > 0) unique++;
        System.out.println("Unique Letters: " + unique);

    }
}
