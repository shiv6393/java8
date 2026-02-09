package multithreading;
public class ProblemWithIntrinsicLock {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(10000);
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
    int balance;
    BankAccount(int balance){
        this.balance=balance;
    }
     synchronized void withDraw(int amount){
        System.out.println(Thread.currentThread().getName() +"is aceessing");
        if (balance >=amount) {
            System.out.println(Thread.currentThread().getName() +"Transaction is being processed");
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            balance=balance-amount;
            System.out.println("Your remaining balance is :"+ amount);
            
        }
        else{
            System.out.println("Insufficient amount");
        }

    }
    
}
