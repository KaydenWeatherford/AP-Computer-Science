package Q3.Prog505a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prog505a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505a.dat"));
            List<BookPerson> list = new ArrayList<BookPerson>();

            while (file.hasNext()) {
                String fname = file.next();
                String lname = file.next();
                int books = file.nextInt();
                String name = fname + " " + lname;
                BookPerson fuckenNerd = new BookPerson(name, books);
                list.add(fuckenNerd);
            }

            for (int i = 0; i < list.size(); i++) {
                BookPerson currentNerd = list.get(i);
                currentNerd.calc();
            }

            System.out.println("Reading Contest thing:\nName\tBooks\tPoints");

            for (BookPerson e : list) {
                System.out.println(e);
            }

            double sadjfhdsfdsfsodjfhds = 0;
            for (BookPerson e : list)
                sadjfhdsfdsfsodjfhds += e.getPoints();
            double avgsomethingiguess = sadjfhdsfdsfsodjfhds / list.size();
            System.out.println("\nAverage Points: " + avgsomethingiguess);

            int topscorepointthingisuppose = list.get(0).getPoints();
            String winnernamethatshouldgoontheleaderboard = list.get(0).getName();
            for (int i = 1; i < list.size(); i++) {
                BookPerson gaymanSteve = list.get(i);
                if (list.get(i).getPoints() > topscorepointthingisuppose) {
                    topscorepointthingisuppose = gaymanSteve.getPoints();
                    winnernamethatshouldgoontheleaderboard = gaymanSteve.getName();
                }
            }
            System.out.println("\nThe Winner is: " + winnernamethatshouldgoontheleaderboard);


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
/*
Reading Contest thing:
Name	Books	Points
Sam Summer	4	45
Linda Lazy	2	20
Paul Prodder	5	60
K.C. Master	8	115
Richie Reader	6	75

Average Points: 63.0

The Winner is: K.C. Master
 */