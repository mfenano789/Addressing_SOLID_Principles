package violated.ocp;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generatePDF() {
        System.out.println("Generating PDF for invoice: " + amount);
    }

    public void generateCSV() {
        System.out.println("Generating CSV for invoice: " + amount);
    }
}
