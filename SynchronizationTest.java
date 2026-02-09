public class SynchronizationTest extends Thread{
    Counter counter;
    SynchronizationTest(Counter counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=0;i<10000;i++){
            counter.increment();
        }
    }
    public static void main(String[] args) {
        Counter counter=new Counter();
        SynchronizationTest t1=new SynchronizationTest(counter);
        SynchronizationTest t2=new SynchronizationTest(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(counter.count);
    } 
}
