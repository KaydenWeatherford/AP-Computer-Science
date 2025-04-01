package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog505t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505t.txt"));
            ArrayList<Cow> Car = new ArrayList<Cow>();
            ArrayList<Horse> Honse = new ArrayList<Horse>();
            int numHay = file.nextInt();
            double HayPrice = file.nextDouble();
            int numCorn = file.nextInt();
            double CornPrice = file.nextDouble();
            int numocows = file.nextInt();


            for (int i = 0; i < numocows; i++) {
                Cow moo = new Cow("Mooer", file.nextInt(), file.nextInt(), file.nextInt(), file.nextInt());
                Car.add(moo);
            }

            int numohorse = file.nextInt();
            for (int i = 0; i < numohorse; i++) {
                Horse Neigh = new Horse("Neigher", file.nextInt(), file.nextInt(), file.nextInt(), file.nextInt(), file.nextDouble());
                Honse.add(Neigh);
            }

            Farm farm = new Farm(Car, Honse, numHay, numCorn, HayPrice, CornPrice);


            // Income
            double moola = farm.farmIncome();
            System.out.printf("The total income for the day is $%.2f\n\n", moola);

            // Cost to feed
            double munchies = farm.getCost();
            System.out.printf("It will cost $%.2f to feed the animals.\n\n", munchies);

            // Get weight
            int weightz = farm.getWeight();
            System.out.printf("The weight of all the animals is %d lbs\n\n", weightz);

            // FEED
            System.out.println("Do we have enough to feed all the animals?");
            if (!farm.feedAllAnimals()) {
                System.out.println("We dont have enough to feed all the animals!");
            } else if (farm.feedAllAnimals()) {
                System.out.println("We have enough to feed all the animals.");
                System.out.println("Animals have been fed.");
            }


            // Sell them Cows
            ArrayList<Cow> theCowz = farm.getCows();
            double lowestVal = theCowz.getFirst().Value();
            int index = 0;
            for (int j = 0; j < 3; j++) {
                for (int i = 1; i < theCowz.size(); i++) {
                    if (theCowz.get(i).Value() < lowestVal) {
                        lowestVal = theCowz.get(i).Value();
                        index = i;
                    }
                }
                theCowz.remove(index);
                index = 0;
            }
            farm.thisisthecowsnow(theCowz);

            // Sell them Horses
            ArrayList<Horse> theHeyrs = farm.getHorses();
            double lowestValH = theHeyrs.getFirst().Value();
            int H = 0;
            for (int j = 0; j < 2; j++) {
                for (int i = 1; i < theHeyrs.size(); i++) {
                    if (theHeyrs.get(i).Value() < lowestVal) {
                        lowestValH = theHeyrs.get(i).Value();
                        H = i;
                    }
                }
                theHeyrs.remove(index);
                H = 0;
            }
            farm.thisisthehorsesnow(theHeyrs);

            // Change the first Cow
            ArrayList<Cow> myGangTM = farm.getCows();
            Cow newGangMember = new Cow("Mooer2.0", 1250, 80, 3, 4);
            myGangTM.set(0, newGangMember);
            farm.thisisthecowsnow(myGangTM);


            // How many cows and horses left
            int cowz = farm.getCows().size();
            int horz = farm.getHorses().size();
            System.out.println("\nThere are " + cowz + " cows and there are " + horz + " horses.");


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
The total profit for the day is $259.40

It will cost $221.35 to feed the animals.

The weight of all the animals is 42835 lbs

Do we have enough to feed all the animals?
We have enough to feed all the animals.
Animals have been fed.

There are 12 cows and there are 8 horses.
 */
