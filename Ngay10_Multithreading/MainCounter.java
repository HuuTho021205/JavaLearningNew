package Ngay10_Multithreading;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterTask task = new CounterTask(counter);

        Thread work1 = new Thread(task);
        Thread work2 = new Thread(task);

        work1.start();
        work2.start();

        try {
            work1.join();
            work2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Kết quả cuối cùng: " + counter.getCount());
    }
}
