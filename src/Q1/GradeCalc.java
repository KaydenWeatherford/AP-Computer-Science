package Q1;
import java.util.*;

public class GradeCalc {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your grade as a percent: ");
        double gp = inp.nextDouble();


        // meth
        // boolean test = (gp >= 90);

        String grade = "";
        if (gp >= 90)      grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else               grade = "F";





        System.out.println("Your grade is an " + grade);
    }
}
