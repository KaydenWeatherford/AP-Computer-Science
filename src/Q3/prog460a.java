package Q3;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class prog460a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/???.dat"));
            int[] list = new int[60];
            int cnt = 0;

            while (file.hasNext()) {
                list[cnt] = file.nextInt();
                cnt++;
            }
            Arrays.sort(list);


            Scanner input = new Scanner(System.in);
            int num = 0;
            while (num != -1) {
                System.out.print("\nPick a number (1-100): ");
                num = input.nextInt();
                int index = SearchAlgs.linearSearch(list, num);
                //  int index = SearchAlgs.binarySearch(list, num);
                //  int index = SearchAlgs.binarySearchRec(list, num);

                if (index == -1) {
                    System.out.println("Number isn't in list.");
                } else {
                    System.out.println("Number occurs at index: " + index);
                }
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}


