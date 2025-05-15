package Q4.LibMangSys;

import java.util.ArrayList;
import java.util.Random;

public class Patron {
    private String name;
    private String patronId;
    private double MONEY;
    private ArrayList<Book> checkedOutBooks;
    private final Random rand = new Random();


    // TODO: Implement constructor (name, patronId)
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        MONEY = rand.nextInt(0, 50100) / 100.0;
    }

    public Patron(String name, String patronId, double money) {
        this.name = name;
        this.patronId = patronId;
        MONEY = money;
    }

    // Basic getters
    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }

    public double getMoney() {
        return MONEY;
    }

    public ArrayList<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    // Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    public void checkOutBook(Book book, int d, int m, int y) {
        checkedOutBooks.add(book);
    }

    public void checkInBook(Book book, int d, int m, int y) {
        checkedOutBooks.remove(book);
        if (checkedOutBooks.size() == 0) {

        }
    }

}
