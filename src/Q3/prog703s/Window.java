package Q3.prog703s;

public class Window extends OS {
    private final double version;

    public Window(String name, int num, double val, double ver) {
        super(name, num, val);
        version = ver;
    }

    public double getVersion() {
        return version;
    }
}
