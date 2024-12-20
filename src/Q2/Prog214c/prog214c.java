package Q2.Prog214c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog214c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<ILOVEDRINKINGGASOLINE> iSWEAR = new ArrayList<>();

            // R = Regular, P = Premium, H = High Octane
            while (file.hasNext()) {
                String type = file.nextLine();
                System.out.println(type);
                double gal = file.nextDouble();
                System.out.println(gal);
                String cw = file.nextLine();
                System.out.println(cw);
                ILOVEDRINKINGGASOLINE giveMeGas = new ILOVEDRINKINGGASOLINE(type, gal, cw);
                iSWEAR.add(giveMeGas);
            }

            for (int i = 0; i < iSWEAR.size(); i++) {
                System.out.println("KAYDEN'S GAS");
                System.out.printf("-----\nGas Used\t%.2f\t\t= %.2f\n", iSWEAR.get(i).getGallons(), iSWEAR.get(i).gasPrice());
                System.out.printf("Car Wash?\t%s\t\t= %.2f\n", iSWEAR.get(i).getCarWash(), iSWEAR.get(i).CarWashPrice());
                double total = iSWEAR.get(i).CarWashPrice() + iSWEAR.get(i).gasPrice();
                System.out.printf("\nTotal\t  \t\t= %.2f", total);
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
