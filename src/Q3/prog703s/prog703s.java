package Q3.prog703s;

import Q3.GetDigit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.txt"));
            ArrayList<OS> putr = new ArrayList<>();

            while (file.hasNext()) {
                int type = file.nextInt();
                if (type == 1) {
                    OS fren = new Apple(file.next(), file.nextInt(), file.nextDouble(), file.next());
                    putr.add(fren);
                } else if (type == 2) {
                    OS fren = new Window(file.next(), file.nextInt(), file.nextDouble(), file.nextDouble());
                    putr.add(fren);
                } else if (type == 3) {
                    OS fren = new Linux(file.next(), file.nextInt(), file.nextDouble(), file.nextInt());
                    putr.add(fren);
                }
            }


            int numGreen = 0;
            int numGold = 0;
            for (OS p : putr) {
                if (p instanceof Apple) {
                    if (((Apple) p).getColor().equals("Green")) {
                        numGreen++;
                    } else if (((Apple) p).getColor().equals("Gold")) {
                        numGold++;
                    }
                }
            }
            System.out.println("The total number of Green putrs: " + numGreen);
            System.out.println("The total number of Gold putrs:  " + numGold);
            System.out.println("The total of Green & Gold putrs: " + (numGreen + numGold));

            int numSevPutr = 0;
            for (OS x : putr) {
                if (x instanceof Window) {
                    if (((Window) x).getVersion() == 7.0) {
                        numSevPutr++;
                    }
                }
            }
            System.out.println("\nTotal number of Windows computers running version 7.0: " + numSevPutr);

            int fiveCode = 0;
            for (OS y : putr) {
                if (y instanceof Linux) {
                    int code = (int) ((Linux) y).getCode();
                    if (GetDigit.getDigit(1, code) == 5) {
                        fiveCode++;
                    }
                }
            }
            System.out.printf("\n%d Linux computers have a code that end in 5.\n", fiveCode);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
