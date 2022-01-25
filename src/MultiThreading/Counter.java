package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int counter = 0;
    private ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {

    }

    public void increment() {
        lock.lock();
        counter += 1;
        lock.unlock();
    }

    public int getCounter() {
        return counter;
    }
}
