package comp.examples.codes.threads;

public class Mythread2 extends Thread{
    public void run(){
        try{
            for (int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(3000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main (String[] args){
        Mythread2 t1=new Mythread2();
        Mythread2 t2=new Mythread2();
        t1.start();
        try{
            t1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        t2.start();
    }
}
