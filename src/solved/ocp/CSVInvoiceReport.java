package solved.ocp;

public class CSVInvoiceReport implements InvoiceReport {
    public void generate(Invoice invoice) {
        System.out.println("Generating CSV for invoice: " + invoice.getAmount());
    }
}
