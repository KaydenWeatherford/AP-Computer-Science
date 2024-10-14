package Q1.Prog93aCl;
import java.util.Scanner;

public class Prog93aCl {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input total Kilowatts used: ");

        Cl93a thing = new Cl93a(inp.nextInt());
        thing.calc();
        System.out.println(thing);
    }
}
