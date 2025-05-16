package Q4.LibMangSys;

public class Transaction {
    private String isbn;
    private String patronId;
    private int[] checkoutDate; // Simple date format
    private int[] returnDate; // Optional, can be null if not returned yet
    private double price;

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default
    public Transaction(String isbn, String patronId, int[] checkoutDate, int[] returnDate, double price) {
        this.isbn = isbn;
        this.patronId = patronId;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
        this.price = price;

    }

    // TODO: Implement getters and setters
    public String getIsbn() {
        return isbn;
    }

    public String getPatronId() {
        return patronId;
    }

    public int[] getCheckoutDate() {
        return checkoutDate;
    }

    public int[] getReturnDate() {
        return returnDate;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
