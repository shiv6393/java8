public class Mythread extends Thread{
    public void run(){
        System.out.println("Thread is running");
       try{ Thread.sleep(2000);}
         catch(InterruptedException e){
          System.out.println(e);
         }
    }
    public static void main(String[] args) throws InterruptedException{
        Mythread t1=new Mythread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        // Thread.sleep(100);
        System.out.println(t1.getState());
    }
    
}
