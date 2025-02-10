package Q3.prog607a;

public class Encode {
    private final int m;
    private final int d;
    private int y;
    private String code;
    private final String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z"};


    public Encode(int month, int day, int year) {
        m = month;
        d = day;
        y = year;
        code = "";
    }

    public void convert2Code() {
        if (y >= 1970) {
            y -= 1970;
        } else if (y >= 70) {
            y -= 70;
        }

        code += abc[m - 1];
        code += abc[(d - (d % 10)) / 10 + 18] + abc[(d % 10) + 18];
        code += abc[25 - y];
    }

    public String getCode() {
        return code;
    }

}
