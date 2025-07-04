package Exercise2_Factory;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document.");
    }
}
