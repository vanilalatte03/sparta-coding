package chapter3.thread.runnable;

public class MyRunnable extends MyNewClass implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
