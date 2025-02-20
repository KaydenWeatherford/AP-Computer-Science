package Q3;

public class GetDigit {
    public static int getDigit(int DigitPosition, int number) {
        int nuhuh = ((int) Math.log10(number) + 1);
        if (DigitPosition > nuhuh) {
            System.out.println("Out of bounds.");
            return -1;
        }
        int remainder = 0;
        for (int x = 0; x < DigitPosition; x++) {
            remainder = number % 10;
            number = number / 10;
        }
        return remainder;
    }
}
