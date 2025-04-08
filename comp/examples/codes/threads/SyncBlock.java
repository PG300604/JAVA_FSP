package comp.examples.codes.threads;

class PerformTask {
    void displayTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + "x" + i + "=" + (n * i));
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Thread1 extends Thread {
    PerformTask t;
    public Thread1(PerformTask t) {
        this.t = t;
    }
    public void run() {
        t.displayTable(10);
    }
}

class Thread2 extends Thread {
    PerformTask t;
    public Thread2(PerformTask t) {
        this.t = t;
    }
    public void run() {
        t.displayTable(20);
    }
}

public class SyncBlock {
    public static void main(String[] args) {
        PerformTask p1 = new PerformTask();
        PerformTask p2 = new PerformTask();

        Thread1 t1 = new Thread1(p1);
        Thread2 t2 = new Thread2(p2);

        t1.start();
        t2.start();
    }
}

