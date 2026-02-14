package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock {
    private static final Lock unfairLock=new ReentrantLock();
    public void accessResources(){
        unfairLock.lock();
        try{System.out.println(Thread.currentThread().getName()+"Has Acquired lock");
        Thread.sleep(2000);}
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println(Thread.currentThread().getName()+"Has Released lock");
            unfairLock.unlock();
        }
    }
    
}
