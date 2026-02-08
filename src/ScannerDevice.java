public class ScannerDevice implements Scannable {
    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }
}