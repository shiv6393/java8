package multithreading;
public class DeadLock {
    public static void main(String[] args) {
         Pen pen =new Pen();
         Paper paper =new Paper();
        Runnable task1=()->{
            pen.writeWithPenAndPaper(paper);

        };
        Runnable task2=()->{
            paper.writeWithPaperAndPen(pen);

        };
        new Thread(task1,"Thread-1").start();
        new Thread(task2,"Thread-2").start();
        
    }
    
}
class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println("using pen "+Thread.currentThread().getName()+this +"And trying to use the Paper");
         paper.finishedWriting();
    }
    synchronized void finishedWriting(){
            System.out.println("Finished writing with pen "+Thread.currentThread().getName()+this);
           
        }
}
class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println("using paper "+Thread.currentThread().getName()+this +"And trying to use the Pen");
         pen.finishedWriting();

    }
   synchronized void  finishedWriting(){
            System.out.println("Finished writing with paper "+Thread.currentThread().getName()+this);
           
        }
}

