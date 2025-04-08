package comp.examples.codes.threads;

public class SharedResource {
    synchronized void waitForSignal(){
        System.out.println("Waiting For Signal.....");
        try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread 1 got Notification for Running....");
    }
    synchronized void provideSignal(){
        System.out.println("Signal Provided....");
        notify();
    }
    public static void main(String[] args){
        SharedResource obj=new SharedResource();
        Thread t1=new Thread(()->obj.waitForSignal());
        Thread t2=new Thread(()-> obj.provideSignal());
        t1.start();
        t2.start();
    }
}
