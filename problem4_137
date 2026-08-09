public class Problem4 {

    static class PrinterManager {
        private static PrinterManager instance;
        private int jobCount = 0;

        private PrinterManager() {}

        static PrinterManager getInstance() {
            if (instance == null)
                instance = new PrinterManager();
            return instance;
        }

        void print(String job) {
            jobCount++;
            System.out.println("Printing: " + job);
        }
    }

    public static void main(String[] args) {
        PrinterManager p1 = PrinterManager.getInstance();
        PrinterManager p2 = PrinterManager.getInstance();

        p1.print("Job 1");
        p2.print("Job 2");

        System.out.println("Total Jobs: " + p1.jobCount);
    }
}
