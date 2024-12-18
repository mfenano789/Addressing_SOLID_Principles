package solved.srp;

public class BookPersistence {
    public void saveToFile(Book book, String filename) {
        System.out.println("Saving book '" + book.getTitle() + "' by " + book.getAuthor() + " to file: " + filename);
    }
}
