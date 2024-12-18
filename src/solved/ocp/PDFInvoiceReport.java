package solved.ocp;

public class PDFInvoiceReport implements InvoiceReport {
    public void generate(Invoice invoice) {
        System.out.println("Generating PDF for invoice: " + invoice.getAmount());
    }
}
