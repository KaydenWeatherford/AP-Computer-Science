package Q3.prog607a;

import java.util.Scanner;

public class prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean rah = true;

        while (rah = true) {
            int m = 0, d = 0, y = 0;
            String Code = "";
            System.out.println("-----menu-----\n" +
                    "0) Quit\n" +
                    "1) Encode Date\n" +
                    "2) Decode Date\n" +
                    "Select an option: ");
            int option = input.nextInt();
            System.out.println();

            if (option == 1) {
                System.out.print("Enter date ( M/D/Y ): ");
                m = input.nextInt();
                d = input.nextInt();
                y = input.nextInt();
                Encode getThisDone = new Encode(m, d, y);
                getThisDone.convert2Code();
                String code = getThisDone.getCode();
                System.out.println(code);


            } else if (option == 2) {
                System.out.println("Enter the code: ");
                input.nextLine();
                Code = input.nextLine();
                Decode wah = new Decode(Code);
                wah.dekod();
                wah.printDate();

            } else if (option == 0) {
                return;
            } else {
                System.out.println("Please input a valid Option.\n");
            }
        }
    }
}
/*
-----menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option:
2

Enter the code:
EUXU

5/25/1975
-----menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option:
0


Process finished with exit code 0

 */