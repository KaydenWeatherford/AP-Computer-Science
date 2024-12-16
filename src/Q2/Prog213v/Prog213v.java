package Q2.Prog213v;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Prog213v {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213v.dat"));
            ArrayList<Transaction> list = new ArrayList<>();

            double balance = file.nextDouble();
            Bank bank = new Bank(balance);

            String code = file.next();
            while (!code.equals("E")) {
                double amount = file.nextDouble();
                Transaction guh = new Transaction(code, amount);
                list.add(guh);
                code = file.next();
            }

            for (int i = 0; i < list.size(); i++) {
                bank.calc(list.get(i));
            }

            System.out.println("The final balance is: $" + bank.getAmount());
            // TODO: the rest


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
