package Q4.MSOE;

import java.util.Scanner;

public class MSOE_2019_1 {

    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);

        System.out.println("Enter the first character:");
        String fst = uwu.nextLine().toLowerCase();
        System.out.println("Enter the second character:");
        String snd = uwu.nextLine().toLowerCase();
        System.out.println("Enter the text:");
        String text = uwu.nextLine().toLowerCase();

        int cnt = 0;
        for (int i = 1; i < text.length(); i++) {
            if (text.substring(i - 1, i).equals(fst)) {


                if (text.substring(i, i + 1).equals(snd)) {

                    cnt++;
                }

            } else if (text.substring(i - 1, i).equals(snd)) {

                if (text.substring(i, i + 1).equals(fst)) {

                    cnt++;
                }
            }
        }


        System.out.printf("\nThere are %d combos in the text \n\n%s\n\nof %s and %s", cnt, text, fst, snd);
    }
}

/*
There are 3 combos in the text

their fields are in the hidden foreign forest

of i and e
*/