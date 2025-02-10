package Q3;

import java.util.Scanner;

public class prog162aRecursive {
    public static int SPPPPPPPPPPPPPPPIIIIIIIIIIIIIIIINNNNNNNNNNNNNNNNNNNNNNNN(int a) {
        int packaging = 1;
        for (int fag = 1; fag < a; fag++) {
            packaging *= fag;
        }
        return packaging;
    }

    public static int COUNTERSPPPPPIIIINNNNNNNNNNWEEEEEEEEEEEEEEEEEEEE(int AHHHHH) {
        int packenagoodoutfit = 1;
        for (int WEEEEEEEEEE = AHHHHH; WEEEEEEEEEE > 0; WEEEEEEEEEE--) {
            packenagoodoutfit *= WEEEEEEEEEE;
        }
        return packenagoodoutfit;
    }

    public static int TOTHEFACTORYWITHYOU(int OwenWhite) {
        if (OwenWhite <= 1) return 1;
        return OwenWhite * TOTHEFACTORYWITHYOU(OwenWhite - 1);
    }

    public static void main(String[] args) {
        Scanner LOLZ = new Scanner(System.in);
        System.out.print("Enter a numbar:::: ");
        int RAHHHHHH = LOLZ.nextInt();
        while (RAHHHHHH != 0) {
            int far = TOTHEFACTORYWITHYOU(RAHHHHHH);
            System.out.println(RAHHHHHH + "! = " + far);
            System.out.print("Enter a numbar:::: ");
            RAHHHHHH = LOLZ.nextInt();
        }

    }
}
