package Q3.prog703s;

public class Linux extends OS {
    private final int code;

    public Linux(String name, int num, double val, int secret) {
        super(name, num, val);
        code = secret;
    }

    public double getCode() {
        return code;
    }
}
