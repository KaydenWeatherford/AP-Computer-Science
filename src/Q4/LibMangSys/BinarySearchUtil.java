package Q4.LibMangSys;

import java.util.ArrayList;
import java.util.Comparator;

public class BinarySearchUtil {
    // TODO: Implement binary search method (takes in ArrayList) using recursion for
    //  searching books by title (required) or author

    private ArrayList<Book> sortBooksByTitle(ArrayList<Book> books) {
        books.sort(Comparator.comparing(book -> book.getTitle().toLowerCase())); // gpt gave me this
        return books;
    }

    private ArrayList<Book> sortBooksByAuthor(ArrayList<Book> books) {
        books.sort(Comparator.comparing(book -> book.getAuthor().toLowerCase())); // and this too ig
        return books;
    }

    public static int BinarySearchUtil(ArrayList<Book> books, String target, int low, int high, int thisDeterminesTitleOrAuthor) {
        if (thisDeterminesTitleOrAuthor == 0) {
            if (low > high) {
                return -1;
            }

            int mid = low + (high - low) / 2;
            String midTitle = books.get(mid).getTitle().toLowerCase();
            int compare = midTitle.compareTo(target.toLowerCase());

            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                return BinarySearchUtil(books, target, mid + 1, high, 0);
            } else {
                return BinarySearchUtil(books, target, low, mid - 1, 0);
            }
        } else if (thisDeterminesTitleOrAuthor == 1) {
            if (low > high) {
                return -1;
            }

            int mid = low + (high - low) / 2;
            String midTitle = books.get(mid).getAuthor().toLowerCase();
            int compare = midTitle.compareTo(target.toLowerCase());

            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                return BinarySearchUtil(books, target, mid + 1, high, 1);
            } else {
                return BinarySearchUtil(books, target, low, mid - 1, 1);
            }
        }
        return -1;
    }

}
