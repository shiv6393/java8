package multithreading;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
public class BankAccount {
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
                e.printStackTrace();
            }
            finally{
                lock.unlock();
            }
            balance=balance-amount;
            System.out.println("Your remaining balance is :"+ amount);
            
            
        }
     else{
            System.out.println("Insufficient amount");
        }}}
        catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
