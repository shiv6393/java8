public class DemonThread extends Thread {
    DemonThread(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        DemonThread t1=new DemonThread("shivam");
        t1.setDaemon(true);
        t1.start();
        System.out.println("main done");
    }
    
}
