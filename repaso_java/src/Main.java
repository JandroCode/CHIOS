import interfaces.impl.PdfImplementation;
import interfaces.impl.WordImplementation;

public class Main {
    public static void main(String[] args) {

        PdfImplementation pdfImplementation= new PdfImplementation();
        pdfImplementation.print(".pdf");

        WordImplementation wordImplementation = new WordImplementation();
        wordImplementation.print(".docx");
    }
}