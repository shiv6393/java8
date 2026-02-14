package multithreading;
// Why is it called "Reentrant"?
// A lock is reentrant if a thread that already holds the lock can acquire it again without deadlocking itself.

// It maintains a hold count. If Thread A locks the object, the count is 1. If Thread A calls another method that requires the same lock, the count becomes 2. The lock is only truly released when the count returns to 0.
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterentLockExample {
   private final Lock lock=new ReentrantLock();
   public void outerMethod(){
    lock.lock();
    try{
        System.out.println("Outer Method");
        innerMethod();
    }
    finally{
        lock.unlock();
    }
   }
 public void innerMethod(){
    lock.lock();
    try{
        System.out.println("Inner Method");
        outerMethod();
    }
    finally{
        lock.unlock();
    }
 }
 public static void main(String[] args) {
    ReenterentLockExample r=new ReenterentLockExample();
    r.outerMethod();
    r.innerMethod();
    r.outerMethod();
 }
    
}
