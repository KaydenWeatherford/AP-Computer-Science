package Q2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog410t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/survey2.dat"));
            ArrayList<HELPMEMIKE> goofies = new ArrayList<>();

            System.out.println("ID\tIncome\tMembers");
            while (file.hasNext()) {
                int id = file.nextInt();
                System.out.printf("%d\t", id);
                int income = file.nextInt();
                System.out.printf("%d\t", income);
                int members = file.nextInt();
                System.out.printf("%d\n", members);
                HELPMEMIKE guh = new HELPMEMIKE(id, income, members);
                goofies.add(guh);
            }

            int sum = 0;
            double avg = 0;
            for (HELPMEMIKE thing : goofies) {
                sum += thing.getIncome();
            }
            avg = (double) sum / goofies.size();

            System.out.printf("\nHouseholds with income exceeding an average income of %.2f\n", avg);
            System.out.println("ID\tIncome");
            for (int i = 0; i < goofies.size(); i++) {
                if (goofies.get(i).getIncome() > avg) {
                    System.out.printf("%d\t%d\n",
                            goofies.get(i).getID(), goofies.get(i).getIncome());
                }
            }

            double prec = 0;
            sum = 0;
            for (int i = 0; i < goofies.size(); i++) {
                if (goofies.get(i).getIncome() < goofies.get(i).getPoverty()) {
                    sum += 1;
                }
            }
            prec = (double) sum / goofies.size();
            prec *= 100;
            System.out.println("\nPercent of households below poverty level - ");
            System.out.printf("%.2f%%", prec);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}

/*
ID	Income	Members
1041	12180	4
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
3210	3200	6
3600	6500	5
3601	11970	2
4725	8900	3
6217	10000	2
9280	6200	1

Households with income exceeding an average income of 12707.38
ID	Income
1062	13240
1327	19800
1483	22458
1900	17000
2112	18125
2345	15623

Percent of households below poverty level -
7.69%

 */