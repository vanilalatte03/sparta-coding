package chapter2.interfaceexample.v1;

public class TeslaCar implements Car, Fly{
    public static void main(String[] args) {
        TeslaCar tc = new TeslaCar();
        tc.drive();
        tc.fly();
    }
    @Override
    public void drive() {
        System.out.println("혼자서도 잘 달린다.");
    }

    @Override
    public void fly() {
        System.out.println("날진 못한다.");
    }
}
