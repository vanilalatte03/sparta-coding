package chapter3.thread.multi;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("::: main 쓰레드 시작 :::");
        String threadName = Thread.currentThread().getName();

        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드:" + threadName + "-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("::: " + threadName + "쓰레드 종료 :::");

    }
}
