package Q3.prog701g;

public class Student extends Person {
    private final double Iguessthisismygpaandimnotgoingtocollege;

    public Student(String fn, String ln, double gpa) {
        super(fn, ln); // Calls the superclass constructor
        Iguessthisismygpaandimnotgoingtocollege = gpa;
    }

    public double getGPA() {
        return Iguessthisismygpaandimnotgoingtocollege;
    }
}
