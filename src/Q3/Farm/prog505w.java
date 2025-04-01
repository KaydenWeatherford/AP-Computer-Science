package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prog505w {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<>();

            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();

            int cowRows = file.nextInt();
            int cowPens = file.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = file.next();
                    int weight = file.nextInt();
                    int milk = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    Cow wow = new Cow(name, weight, milk, cornEaten, hayEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = file.nextInt();
            int horsePens = file.nextInt();
            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = file.next();
                    int weight = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    int rides = file.nextInt();
                    double rideCost = file.nextDouble();
                    Horse how = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(how);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }
            //Cow that makes the most money;
            int highValCowIndex = 0;
            double highestValCow = 0;

            double dayTotal = 0;
            for (int a = 0; a < animals.size(); a++) {
                if (animals.get(a) instanceof Cow) {
                    Cow whar = (Cow) animals.get(a);
                    dayTotal += whar.Value();
                    if (whar.Value() > highestValCow) {
                        highValCowIndex = a;
                        highestValCow = whar.Value();
                    }
                }
                if (animals.get(a) instanceof Horse) {
                    Horse har = (Horse) animals.get(a);
                    dayTotal += har.Value();
                }
            }
            System.out.printf("$%.2f is the total income for the day.\n", dayTotal);

            int heavy = 0;
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i) instanceof Cow) {
                    Cow woc = (Cow) animals.get(i);
                    heavy += woc.getWeight();
                }
                if (animals.get(i) instanceof Horse) {
                    Horse esroh = (Horse) animals.get(i);
                    heavy += esroh.getWeight();
                }
            }
            System.out.printf("The total weight of all the animals is %dlbs.\n", heavy);

            String doTheAnimalsHaveEnoughToEatTodayOrDoIGottaGoOutAndBuyGroceries = "";
            if (hay < 0 || corn < 0) {
                doTheAnimalsHaveEnoughToEatTodayOrDoIGottaGoOutAndBuyGroceries = "No";
            } else {
                doTheAnimalsHaveEnoughToEatTodayOrDoIGottaGoOutAndBuyGroceries = "Yes";
            }
            System.out.printf("Do we have enough food for the animals? %s.\n", doTheAnimalsHaveEnoughToEatTodayOrDoIGottaGoOutAndBuyGroceries);

            System.out.printf("The cow %s brings in the most value with $%.2f.\n", animals.get(highValCowIndex).getName(), highestValCow);

            int minHorseIndex = 0;
            double minHorseVal = Double.MAX_VALUE;
            for (int a = 0; a < animals.size(); a++) {
                if (animals.get(a) instanceof Horse) {
                    Horse horse = (Horse) animals.get(a);
                    double horseVal = horse.Value();
                    if (horseVal < minHorseVal) {
                        minHorseIndex = a;
                        minHorseVal = horseVal;
                    }
                }
            }
            System.out.printf("Horse %s makes the least money.\n", animals.get(minHorseIndex).getName());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
$193.86 is the total income for the day.
The total weight of all the animals is 32790lbs.
Do we have enough food for the animals? Yes.
The cow Mary brings in the most value with $9.43.
Horse MarkMark makes the least money.
 */