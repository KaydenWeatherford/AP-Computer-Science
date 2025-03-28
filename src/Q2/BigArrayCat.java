package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BigArrayCat {
    public static void PrintCat(Cat cat) {
        System.out.printf("%s\t%.2f\t%d\t$%.2f\n",
                cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }


    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = file.nextInt();
            file.nextLine();
            ArrayList<Cat> cats = new ArrayList<>();

            for (int i = 0; i < numCats; i++) {
                String n = file.nextLine();
                double w = file.nextDouble();
                int a = file.nextInt();
                double c = file.nextDouble();
                file.nextLine();
                cats.add(new Cat(n, w, a, c));
            }

            // 1. Print out all the cats (there is no toString() available)
            System.out.println("1. All The Cats:");
            System.out.print("Name\tWeight\tAge\tCost\n");
            for (Cat cat : cats) {
                PrintCat(cat);
            }
            // 2. Print the name of the 3rd cat.
            System.out.println("\n2. The third cat's name is: " + cats.get(2).getName());

            // 3. The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
            cats.get(cats.size() - 1).setWeight(cats.get(cats.size() - 1).getWeight() + 10);
            System.out.println("\n3. The updated weight is: " + cats.get(cats.size() - 1).getWeight());

            // 4. The cat named Rascal died. Find that cat and remove it from the list.
            for (int i = 0; i < cats.size(); i++) {
                if (cats.get(i).getName().equals("Rascal")) {
                    cats.remove(i);
                }
            }

            // 5. A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
            cats.add(1, new Cat("Angel", 3.6, 1, 25.99));

            // 6. A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.
            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));

            // 7. Print the updated list with a for-each loop
            System.out.println("\n7. The Updated List Is: ");
            System.out.print("Name\tWeight\tAge\tCost\n");
            for (Cat cat : cats) {
                PrintCat(cat);
            }

            // 8. Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
            Cat third = cats.get(2);
            cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
            cats.add(third);

            // 9. Switch the 2nd and 4th cats.
            Cat temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);

            // 10. Print the names of the cats on the list.
            System.out.println("\n 10. All the Names of the cats: ");
            for (Cat c : cats) {
                System.out.print(c.getName() + "\t");
            }
            System.out.println();

            // 11. Remove all cats under $26. Print the costs of each cat remaining on the list.
            for (int i = 0; i < cats.size(); i++) {
                if (cats.get(i).getCost() < 26) {
                    cats.remove(i);
                    i--;
                }
            }
            System.out.println("\n11. the costs of the remaining cats are: ");
            for (Cat c : cats) {
                System.out.print(c.getCost() + "\t");
            }
            System.out.println();

            // 12. All cats heavier than 15 pounds need to go on a diet <--
            // no for-each this time. Print the names of the cats being put on a diet.
            System.out.println("\n12. The cats being put on a diet are: ");

            for (int i = 0; i < cats.size(); i++) {
                Cat c = cats.get(i);
                if (c.getWeight() > 15) {
                    System.out.print(c.getName() + "\t");
                }
            }
            System.out.println();


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
