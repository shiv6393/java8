package multithreading;

public class ProducerConsumerProblemSOl {
    public static void main(String[] args) {
        Resource resource=new Resource();
        Producer producer=new Producer(resource);
        Consumer consumer=new Consumer(resource);
        Thread producerThread=new Thread(producer,"Thread-1");
        Thread consumerThread=new Thread(consumer,"Thread-2");
        producerThread.start();
        consumerThread.start();
    }
    
}
class Resource{
    boolean hasData;
    int data;
    synchronized int produce(int value){
        while (hasData) {
            try{
                wait();

            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
        data=value;
        hasData=true;
        notify();
        return value;  
    }
    synchronized int consume(){
        while (!hasData) {
            try{
                wait();

            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
        hasData=false;
        notify();
        return data;

    }
}
class Producer implements Runnable{
    Resource resource;
    Producer(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            int producedValue=resource.produce(i);
            System.out.println(Thread.currentThread().getName()+" Produced: "+producedValue);
        }
    }
}
class Consumer implements Runnable{
    Resource resource;
    Consumer(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            int consumedValue=resource.consume();
            System.out.println(Thread.currentThread().getName()+" Consumed: "+consumedValue);
        }
    }
}
