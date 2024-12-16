package Q2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog410t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/survey.dat"));
            ArrayList<Integer> ID = new ArrayList<>();

            while (file.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}

