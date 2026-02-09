package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ByusingExplictLock {
    public static void main(String[] args) {
          BankAccount account=new BankAccount();
        Thread t1=new Thread(new Runnable(){
            public void run(){
                account.withDraw(5000);
            }
        },"Thread 1");
        Thread t2=new Thread(new Runnable(){
            public void run(){
                account.withDraw(7000);
            }
        },"Thread 2");
        t1.start();
        t2.start();

    }

}
class BankAccount {
    int balance= 10000;
    Lock lock=new ReentrantLock();
    void withDraw(int amount){
        System.out.println(Thread.currentThread().getName() +"is aceessing");
       try {if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){
        if (balance >=amount) {
            System.out.println(Thread.currentThread().getName() +"Transaction is being processed");
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                
            }
            finally{
                lock.unlock();
            }
            balance=balance-amount;
            System.out.println("Your remaining balance is :"+ amount);
            
            
        }
     else{
            System.out.println("Insufficient amount");
        }}
     else {
            System.out.println(Thread.currentThread().getName() +"could not acquire lock and is skipping the transaction");
        }}
        catch(Exception e){
            Thread.currentThread().interrupt();
        }

    }
    
}

