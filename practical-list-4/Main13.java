import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main13 {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(10);
        Thread producerThread = new Thread(new Producer(buffer, 5)); // Limiting producer to 5 iterations
        Thread consumerThread = new Thread(new Consumer(buffer, 5)); // Limiting consumer to 5 iterations

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        private BlockingQueue<Integer> buffer;
        private Random random;
        private int iterations;

        public Producer(BlockingQueue<Integer> buffer, int iterations) {
            this.buffer = buffer;
            this.random = new Random();
            this.iterations = iterations;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < iterations; i++) {
                    int number = random.nextInt(100);
                    buffer.put(number);
                    System.out.println("Produced: " + number);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private BlockingQueue<Integer> buffer;
        private int iterations;

        public Consumer(BlockingQueue<Integer> buffer, int iterations) {
            this.buffer = buffer;
            this.iterations = iterations;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < iterations; i++) {
                    int number = buffer.take();
                    double squareRoot = Math.sqrt(number);
                    System.out.println("Pinak viradiya");
		            System.out.println("220130318014");
                    System.out.println("Consumed: " + number + ", Square root: " + squareRoot);
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
