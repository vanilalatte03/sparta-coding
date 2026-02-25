package chapter3.thread.multi;

public class Main {
    public static void main(String[] args) {
        System.out.println("::: main 쓰레드 시작");

        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();

        System.out.println("main이 thread0 실행");
        thread0.start();

        System.out.println("main이 thread1 실행");
        thread1.start();

        System.out.println("메인 쓰레드 종료");
    }
}
