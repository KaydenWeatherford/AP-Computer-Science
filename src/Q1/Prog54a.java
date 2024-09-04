package Q1;
import java.util.*;

public class Prog54a {
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Enter the car Model: ");
        String model = Keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int Miles = Keyboard.nextInt();

        System.out.print("Enter gallons used: ");
        int Gallons = Keyboard.nextInt();

        double mpg = Miles / (double)Gallons;
        System.out.println("MPG used by " + model + " is " + mpg + " (m/g)");
    }
}
