package multithreading;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

public class ReadWriteLockExample {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
        // Extracting the specific locks
        Lock readLock = rwLock.readLock();
        Lock writeLock = rwLock.writeLock();
        
        Counter counter = new Counter();

        Runnable read = (() -> {
            readLock.lock(); // Actually acquire the lock
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());
                }
            } finally {
                readLock.unlock(); // Always release in finally
            }
        });

        Runnable write = (() -> {
            writeLock.lock(); // Actually acquire the lock
            try {
                for (int i = 0; i < 5; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented to: " + counter.getCount());
                }
            } finally {
                writeLock.unlock();
            }
        });

        new Thread(read, "Reader-1").start();
        new Thread(read, "Reader-2").start();
        new Thread(write, "Writer-1").start();
    }
}

class Counter {
    private int count = 0;
    public void increment() { count++; }
    public int getCount() { return count; }
}