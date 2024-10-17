package Q1.Prog285bCl;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog285Cl {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner( new File("Langdat/Prog285b.dat"));

            System.out.println("ID\tCode\tSales\tCommission");
            while (file.hasNext()){
                int id = file.nextInt();
                int c = file.nextInt();
                double s = file.nextDouble();

                Salesperson fred = new Salesperson(id,c,s);
                fred.setComm();
                System.out.println(fred.toString());

            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e);
        }
    }
}
