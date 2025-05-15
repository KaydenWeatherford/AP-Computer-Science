package Q4.LibMangSys;

import java.util.Random;

public class Book extends Media {
    private String author;
    private String genre;
    private int year;
    private int pages;
    private static final String[] genres = {"Anthology", "Autobiography", "Biography", "Children's",
            "Classic Literature", "Coming-of-Age", "Contemporary", "Cozy Mystery", "Crime", "Dark Fantasy", "Detective",
            "Drama", "Dystopian", "Epic Fantasy", "Essay Collection", "Fairy Tale Retelling", "Fantasy", "Fiction Historical",
            "Fiction Literary", "Fiction Political", "Fiction Religious", "Fiction War", "Fiction Science", "Fiction Gothic",
            "Humor", "Inspirational", "Magical Realism", "Memoir", "Mystery", "Mythology", "New Adult", "Paranormal", "Poetry",
            "Psychological Thriller", "Romance", "Satire", "Short Stories", "Space Opera", "Steampunk",
            "Supernatural", "Suspense", "Thriller", "Urban Fantasy", "Western", "Young Adult"};

    private Random rand = new Random();


    // TODO: Implement constructor (title, isbn, author); call super constructor
    public Book(String title, String isbn, String author) {
        super(title, isbn);
        this.author = author;
        genre = genres[rand.nextInt(0, genres.length - 1)];
        year = rand.nextInt(1945, 2025);
        pages = rand.nextInt(1, 401);
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
