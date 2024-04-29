public class Main12 {
    public static void main(String[] args) {
        Thread taskThread = new Thread(new LongRunningTask());
        Thread progressBarThread = new Thread(new ProgressBar());

        taskThread.start();
        progressBarThread.start();
    }

    static class LongRunningTask implements Runnable {
        @Override
        public void run() {
            // Simulate a long-running task (sorting a large list)
            int totalItems = 10000;
            for (int i = 0; i < totalItems; i++) {
                // Some processing here
                // Simulate progress by sleeping for a short time
                try {
                    Thread.sleep(10); // Sleep for 10 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Task completed.");
        }
    }

    static class ProgressBar implements Runnable {
        @Override
        public void run() {
            int totalItems = 10000;
            int progress = 0;
            while (progress < totalItems) {
                int percentage = (int) ((double) progress / totalItems * 100);
                updateProgressBar(percentage);
                progress += 100; // Simulate progress by incrementing
                try {
                    Thread.sleep(1000); // Update progress every second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void updateProgressBar(int percentage) {
            System.out.print("\rProgress: [");
            int completedBlocks = percentage / 2;
            for (int i = 0; i < completedBlocks; i++) {
                System.out.print("=");
            }
            for (int i = completedBlocks; i < 50; i++) {
                System.out.print(" ");
            }
            System.out.println("Pinak viradiya");
	    	System.out.println("220130318014");
            System.out.print("] " + percentage + "%");
        }
    }
}
