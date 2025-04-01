package Q3.Farm;

import java.util.ArrayList;

public interface IFarm {
    boolean feedCows();

    boolean feedHorses();

    /**
     * Feeds all cows and horses where farm has enough food
     */

    boolean feedAllAnimals();

    /**
     * Calculates the value of the milk produced by the
     * cows price for each cow's milk is the same per pound
     */
    private double cowIncome(double perPound) {
        return 0;
    }


    /**
     * Calculates the value of the rides given by the horses
     * ride value of each horse changes based on the horse
     */
    double horseIncome();

    /**
     * Calculates the daily income of the farm
     */
    double farmIncome();

    // Calculates the total weight of all the farm animals
    public int getWeight();


    // Calculates the amount of money it will
    // take to feed the animals for the day
    double getCost();

    // Returns the cows in an ArrayList
    ArrayList<Cow> getCows();

    // Returns the horses in an ArrayList
    ArrayList<Horse> getHorses();
}

