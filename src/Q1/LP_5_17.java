package Q1;
import java.util.Scanner;
public class LP_5_17 {
    public static void main(String[] args) {
        String password = "ImASuperSecretPassword!";
        Scanner inp = new Scanner(System.in);
        int i = 0;
        while (i < 3){
            System.out.println("Input Password:");
            String attempt = inp.nextLine();
            if (!attempt.equals(password)){
                i++;
                System.out.println("Wrong Password");
                System.out.println(" ");
            }
            else if (attempt.equals(password))
            {
                System.out.println("Login Successful!");
                System.out.println("Super_Secret.txt Open");
                System.out.println(":3");
            }
        }
        if (i == 3){
            System.out.println("3 Login Attempts Failed -- Locking...");
        }
    }
}
/*
Input Password:
guh?
Wrong Password
Input Password:
Guh2?
Wrong Password
Input Password:
Grrr
Wrong Password
3 Login Attempts Failed -- Locking...
 */