package violated.srp;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void saveToFile(String filename) {
        System.out.println("Saving book '" + title + "' by " + author + " to file: " + filename);
    }
}
