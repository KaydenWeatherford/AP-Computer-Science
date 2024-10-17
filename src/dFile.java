import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class dFile {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner( new File("Langdat/FILENAME"));

            while (file.hasNext()); {

            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getStackTrace());
        }
    }
}
