package Q1.Prog52aCl;
import java.util.Scanner;

public class Cl52a {
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // Input Section (Constructor)
    public Cl52a(int len, int wid){
        // Set Private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;


    }

    // Calculation (Mutators/Setters)

    public void calc(){
        myArea = myLen * myWid;
        myPerim = (myLen * 2) + (2 * myWid);

    }

    // Output (Accessors/Getters

    public int getArea(){return myArea;}
    public int getPerim(){return myPerim;}

    // Class Method: "Public <return_type> <name>(<args>) {...}"

}
