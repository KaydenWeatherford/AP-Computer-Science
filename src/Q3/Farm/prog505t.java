package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog505t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/505t.txt"));
            ArrayList<Animal> Anim = new ArrayList<Animal>();
            int numHay = file.nextInt();
            double HayPrice = file.nextDouble();
            int numCorn = file.nextInt();
            double CornPrice = file.nextDouble();

            for (int i = 0; i < file.nextInt(); i++) {
                Cow moo = new Cow("Mooer", i, file.nextInt(), file.nextInt(), file.nextInt());
                Anim.add(moo);
            }
            for (int i = 0; i < file.nextInt(); i++) {
                Horse Neigh = new Horse("Neigher", file.nextInt(), file.nextInt(), file.nextInt(), file.nextInt(), file.nextDouble());
                Anim.add(Neigh);
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}