package Q3.prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog701g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));
            ArrayList<Person> AHHHHHHHHHH = new ArrayList<Person>();
            int num = file.nextInt();

            while (num != 99) {
                String f = file.next();
                String l = file.next();

                if (num == 1) {
                    double gpa = file.nextDouble();
                    Person p = new Student(f, l, gpa);
                    AHHHHHHHHHH.add(p);
                } else if (num == 2) {
                    int stus = file.nextInt();
                    Person p = new Teacher(f, l, stus);
                    AHHHHHHHHHH.add(p);
                } else if (num == 3) {
                    String word = file.next();
                    Person p = new Admin(f, l, word);
                    AHHHHHHHHHH.add(p);
                }
                num = file.nextInt();

            }
            double tot = 0;
            int cnt = 0;
            int totstus = 0;
            String large = "";
            String small = "dshgfikfdeifbisfkkkkbposadfodsflkwsajnbfdskjfnbdwsakfjbdsafkjdsabfikdsajbviajhdsbfvajwsnbfpcoaiskjnf";

            for (Person p : AHHHHHHHHHH) {
                if (p instanceof Student) {
                    tot += ((Student) p).getGPA();
                    cnt++;
                } else if (p instanceof Teacher) {
                    totstus += ((Teacher) p).getNumStu();
                } else if (p instanceof Admin) {
                    String word = ((Admin) p).getMyFav();
                    if (word.length() > large.length()) {
                        large = word;
                    }
                    if (word.length() < small.length()) {
                        small = word;
                    }

                }
            }

            System.out.printf("Average Student GPA: %.2f\n", tot / cnt);
            System.out.println("Total number of students tought by teachers: " + totstus);
            System.out.println("Smallest Favorite Admin Word: " + small);
            System.out.println("Largest Favorite Admin Word: " + large);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
