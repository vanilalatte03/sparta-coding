package chapter3.thread.join;

import chapter3.thread.multi.MyThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("::: main 쓰레드 시작");

        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();

        long startTime = System.currentTimeMillis();

        System.out.println("thread0 시작");
        thread0.start();

        System.out.println("thread1 시작");
        thread1.start();

        try{
            thread0.join();
            thread1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("총 작업시간: " + totalTime + "ms");
        System.out.println("메인 쓰레드 종료");
    }
}
