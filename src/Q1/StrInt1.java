package Q1;
import java.util.Scanner;

public class StrInt1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input a String: ");
        String str = inp.nextLine();
        System.out.println("Duplicate Characters: ");

        for (int lcv = 0; lcv < str.length(); lcv++){
            for (int lcv2 = lcv+1; lcv2 < str.length(); lcv2++){
                String let1 = str.substring(lcv, lcv+1);
                String let2 = str.substring(lcv2, lcv2+1);

                if (let1.equals(let2)){
                    System.out.print(let2 + " ");
                    break;
                }
            }
        }

    }
}
