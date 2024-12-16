package Q2.StudentDB;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDB {
    public static int IndexOfStu(ArrayList<Student> db, int ID) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getId() == ID) return i;
        }
        return -1; // Not Found
    }

    public static int IndexOfStu(ArrayList<Student> db, String last) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getLastName().equals(last)) return i;
        }
        return -1; // Not Found
    }

    public static void printStu(Student S) {
        System.out.printf("%s\t%s\t%d\t%.2f\n", S.getFirstName(), S.getLastName(), S.getId(), S.getGPA());
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Name");
            System.out.println("1 - Add new student ");
            System.out.println("2 - Display all students ");
            System.out.println("3 - Search for student (by id) ");
            System.out.println("4 - Search for student (by last name) ");
            System.out.println("5 - Modify a student’s gpa ");
            System.out.println("6 - Remove student (by id) ");
            System.out.println("7 - Exit ");
            System.out.print("Please Enter Your Choice:");
            int c = inp.nextInt();

            if (c == 1) {
                System.out.print("Enter first name: ");
                String f = inp.nextLine();
                System.out.print("Enter last name: ");
                String l = inp.nextLine();
                System.out.print("Enter Student ID: ");
                int ID = inp.nextInt();
                System.out.print("Enter GPA: ");
                double gpa = inp.nextDouble();
                Student st = new Student(f, l, ID, gpa);
                db.add(st);
            } else if (c == 2) {
                System.out.println("First\tLast\tID\tGPA");
                for (Student s : db) {
                    printStu(s);
                }

            } else if (c == 3) {
                System.out.print("Enter Student ID: ");
                int ID = inp.nextInt();
                int index = IndexOfStu(db, ID);
                if (index != -1) {
                    printStu(db.get(index));
                } else {
                    System.out.println("No Student Was Found with that ID");
                }

            } else if (c == 4) {
                System.out.print("Enter Last Name: ");
                String last = inp.next();
                int index = IndexOfStu(db, last);
                if (index != -1) {
                    printStu(db.get(index));
                } else {
                    System.out.println("No Student Was Found with that Last Name");
                }
            } else if (c == 5) {
                System.out.print("Enter Student ID: ");
                int ID = inp.nextInt();
                int index = IndexOfStu(db, ID);
                if (index == -1) {
                    System.out.println("No Student Was Found");
                } else {
                    System.out.print("Enter new GPA: ");
                    double gpa = inp.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA Updated Successfully!");
                }
            } else if (c == 6) {
                System.out.print("Enter Student ID: ");
                int ID = inp.nextInt();
                int index = IndexOfStu(db, ID);
                if (index == -1) {
                    System.out.println("No Student Was Found");
                } else {
                    db.remove(index);
                }
            } else if (c == 7) {
                return;
            }
        }
    }
}
