package comp.examples.codes.threads;

public class Mythread implements Runnable {
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
        Mythread t1=new Mythread();
        Thread t2=new Thread(t1);
        t2.start();
}
}
