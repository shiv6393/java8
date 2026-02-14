package multithreading;

public class UnfairLockExample {
    public static void main(String[] args) {
        UnfairLock obj=new UnfairLock();
        Runnable task=()->{
            obj.accessResources();
        };
        Thread t1=new Thread(task,"Thread-1");
        Thread t2=new Thread(task,"Thread-2");
        Thread t3=new Thread(task,"Thread-3");
        Thread t4=new Thread(task,"Thread-4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
    
}
