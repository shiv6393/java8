 class ThreadPrac extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }

    
}
public class MultiThreading {
    public static void main(String[] args) {
        ThreadPrac th=new ThreadPrac();
        th.start();
        
    }
    
}
