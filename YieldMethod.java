public class YieldMethod  extends Thread {
    YieldMethod(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
            
        }
    }
    public static void main(String[] args) {
        YieldMethod t1=new YieldMethod("shivam");
        YieldMethod t2=new YieldMethod("satyam");
        t1.start();
        t2.start();
    }

    
}
