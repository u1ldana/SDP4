package task9;

public class ReportingSystem {

    public static void main(String[] args) {

        ReportGenerator pdfReport = new PDFReportGenerator();
        ReportGenerator htmlReport = new HTMLReportGenerator();
        ReportGenerator plainTextReport = new PlainTextReportGenerator();


        System.out.println("Generating PDF Report:");
        pdfReport.generateReport();

        System.out.println("\nGenerating HTML Report:");
        htmlReport.generateReport();

        System.out.println("\nGenerating Plain Text Report:");
        plainTextReport.generateReport();
    }
}
