package Q1;
import java.util.Locale;
import java.util.Scanner;

public class StrInt3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine().toLowerCase();

        for (int lcv = 0; lcv < str.length();lcv++){
            String c = str.substring(lcv,lcv+1);
            if (str.indexOf(c) == str.lastIndexOf(c)){
                System.out.println("First non repeating character is: " + c);
                break;
            }
        }

    }
}
/*
Moring
First non repeating character is: m

 */