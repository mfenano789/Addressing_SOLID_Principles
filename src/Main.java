import solved.srp.Book;
import solved.srp.BookPersistence;
import solved.ocp.Invoice;
import solved.ocp.PDFInvoiceReport;
import solved.ocp.CSVInvoiceReport;
import solved.lsp.Rectangle;
import solved.lsp.Square;

public class Main {
    public static void main(String[] args) {
        // SRP Example
        Book book = new Book("Clean Code", "Robert C. Martin");
        BookPersistence persistence = new BookPersistence();
        persistence.saveToFile(book, "clean-code.txt");

        // OCP Example
        Invoice invoice = new Invoice(500);
        PDFInvoiceReport pdfReport = new PDFInvoiceReport();
        CSVInvoiceReport csvReport = new CSVInvoiceReport();
        pdfReport.generate(invoice);
        csvReport.generate(invoice);

        // LSP Example
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(6);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
    }
}
