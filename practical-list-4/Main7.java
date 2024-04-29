public class Main7 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MessagePrinter("Thread-I", 2500, 5));
        Thread thread2 = new Thread(new MessagePrinter("Thread-II", 5000, 3));
        Thread thread3 = new Thread(new MessagePrinter("Thread-III", 7500, 4));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MessagePrinter implements Runnable {
        private String message;
        private int interval;
        private int limit;

        public MessagePrinter(String message, int interval, int limit) {
            this.message = message;
            this.interval = interval;
            this.limit = limit;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < limit; i++) {
                    System.out.println("Pinak viradiya");
	            	System.out.println("220130318014");
                    System.out.println(message);
                    Thread.sleep(interval);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
