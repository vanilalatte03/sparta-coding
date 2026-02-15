package chapter2.wrapper;

public class MyDouble {
    private double value;


    public MyDouble(double value) {
        this.value = value;
    }

    public void add(double v) {
        this.value += v;
    }

    public double getValue() {
        return value;
    }
}
