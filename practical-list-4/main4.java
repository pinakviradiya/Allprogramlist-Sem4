class DivisibleByThreeThread extends Thread {
    @Override
    public void run() {
        System.out.println("Numbers divisible by 3:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

class DivisibleByFiveThread extends Thread {
    @Override
    public void run() {
        System.out.println("Numbers divisible by 5:");
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class main4 {
    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        DivisibleByThreeThread thread1 = new DivisibleByThreeThread();
        DivisibleByFiveThread thread2 = new DivisibleByFiveThread();

        thread1.start();
        thread2.start();
    }
}
