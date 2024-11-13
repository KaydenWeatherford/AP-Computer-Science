package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTemplate {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435g.dat"));

        } catch (
                IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
