package chapter3.thread.single;

public class Main {
    public static void main(String[] args) {
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

        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드:" + threadName + "-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(":::작업 끝:::");


    }
}
