package Q3.prog702q;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog702q {

    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));
            ArrayList<Vietcongle> Vietconglez = new ArrayList<>();
            while (file.hasNext()) {
                int type = file.nextInt();
                if (type == 1) {
                    Vietcongle drive = new Car(file.next(), file.nextInt(), file.nextDouble());
                    Vietconglez.add(drive);
                } else if (type == 2) {
                    Vietcongle drive = new Truck(file.next(), file.nextInt(), file.nextDouble());
                    Vietconglez.add(drive);
                } else if (type == 3) {
                    Vietcongle drive = new Bus(file.next(), file.nextInt(), file.next());
                    Vietconglez.add(drive);
                }
            }

            System.out.println("The Total Value of the Cars:");
            double sum = 0;
            for (Vietcongle p : Vietconglez) {
                if (p instanceof Car) {
                    sum += p.getValue();
                }
            }
            System.out.printf("$%.2f\n", sum);


            System.out.println("\nThe Total Value of all vehicles:");
            sum = 0;
            for (int i = 0; i < Vietconglez.size(); i++) {
                sum += Vietconglez.get(i).getValue();
            }
            System.out.printf("$%.2f\n", sum);

            System.out.println("\nThe longest Bus home destination name:");
            String longName = "";
            for (Vietcongle p :
                    Vietconglez) {
                if (p instanceof Bus) {
                    if (((Bus) p).getHome().length() > longName.length()) {
                        longName = ((Bus) p).getHome();
                    }
                }
            }
            System.out.println(longName);

            double leastVal = 50000;
            String leastValName = "";

            for (Vietcongle a :
                    Vietconglez) {
                if (a instanceof Truck) {
                    if (a.getValue() < leastVal) {
                        leastVal = a.getValue();
                        leastValName = a.getName();
                    }
                }
            }
            System.out.printf("\nThe lowest value Truck belongs to %s, with a total of $%.2f.\n", leastValName, leastVal);

            System.out.println("\nThe Total Tires for the vehicle types:");
            int CarTires = 0;
            int TruckTires = 0;
            int BusTires = 0;
            for (Vietcongle b :
                    Vietconglez) {
                if (b instanceof Car) {
                    CarTires += b.getTire();
                } else if (b instanceof Truck) {
                    TruckTires += b.getTire();
                } else if (b instanceof Bus) {
                    BusTires += b.getTire();
                }
            }
            System.out.println("Car Tires:\t" + CarTires);
            System.out.println("Truck Tires:\t" + TruckTires);
            System.out.println("Bus Tires:\t" + BusTires);
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
/*
The Total Value of the Cars:
$33950.00

The Total Value of all vehicles:
$428199.75

The longest Bus home destination name:
Minneapolis

The Truck with the least value is:
The lowest value Truck belongs to Fred, with a total of $18750.00.

The Total Tires for the vehicle types:
Car Tires:	15
Truck Tires:	95
Bus Tires:	69


Process finished with exit code 0

 */