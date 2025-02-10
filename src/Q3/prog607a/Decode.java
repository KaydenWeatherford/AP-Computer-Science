package Q3.prog607a;

public class Decode {
    private final String fug;
    private final String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private final int[] date = new int[4];

    public Decode(String codeIthink) {
        fug = codeIthink; // Given String length of 4
    }

    public void dekod() {
        for (int i = 0; i < 26; i++) {
            if (fug.substring(0, 1).equals(abc[i])) {
                date[0] = i + 1;
            }
            if (fug.substring(1, 2).equals(abc[i])) {
                date[1] = i - 18;
            }
            if (fug.substring(2, 3).equals(abc[i])) {
                date[2] = i - 18;
            }
            if (fug.substring(3, 4).equals(abc[i])) {
                date[3] = (25 - i) + 1970;
            }

        }
    }

    public void printDate() {
        System.out.printf("\n%d/%d%d/%d\n", date[0], date[1], date[2], date[3]);
    }

}
