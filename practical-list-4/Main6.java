public class Main6 {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        evenThread.start();
        oddThread.start();
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 50; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(150); // Delay for better visibility
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 50; i += 2) {
                System.out.println("Pinak viradiya");
	        	System.out.println("220130318014");
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100); // Delay for better visibility
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
