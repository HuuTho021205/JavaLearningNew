package Ngay10_Multithreading;

public class CounterTask implements Runnable{
    private Counter counter;

    public CounterTask(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run(){
        for (int i = 0; i <1000000 ; i++) {
            counter.increment();
        }
    }
}
