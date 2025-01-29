package Q3.prog701g;

public class Person implements Names {
    private final String myFirst;
    private final String myLast;

    public Person(String fn, String ln) {
        myFirst = fn;
        myLast = ln;
    }

    public String getFirst() {
        return myFirst;
    }

    public String getLast() {
        return myLast;
    }

    public String getName() {
        return myFirst + " " + myLast;
    }
}
