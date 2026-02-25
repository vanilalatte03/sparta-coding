package chapter3.thread.runnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();

        task.printMessage();

        Thread thread0 = new Thread(task);
        Thread thread1 = new Thread(task);

        thread0.start();
        thread1.start();
    }
}
