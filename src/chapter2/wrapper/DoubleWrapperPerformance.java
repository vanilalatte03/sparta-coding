package chapter2.wrapper;

public class DoubleWrapperPerformance {
    public void run(){
        int loop = 100_000_000;

        long start1 = System.nanoTime();

        double d = 0;
        for (int i = 0; i < loop; i++){
            d += 1.0;
        }

        long end1 = System.nanoTime();
        System.out.println("primitive double time = " + (end1 - start1));

        long start2 = System.nanoTime();


        MyDouble md = new MyDouble(0);
        for (int i = 0; i < loop; i++){
            md.add(1.0);
        }

        long end2 = System.nanoTime();
        System.out.println("MyDouble time = " + (end2 - start2));

    }
}
