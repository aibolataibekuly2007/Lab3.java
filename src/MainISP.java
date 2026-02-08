public class MainISP {
    public static void main(String[] args) {
        Printable basicPrinter = new BasicPrinter();
        basicPrinter.print("Basic document");

        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print("Document");
        allInOnePrinter.scan("Photo");
        allInOnePrinter.fax("Contract");

        Scannable scanner = new ScannerDevice();
        scanner.scan("Important document");
    }
}