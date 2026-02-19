package chapter2.interfaceexample;

public class TeslaCar implements Car {
    @Override
    public void drive() {
        System.out.println("혼자서도 잘 달린다.");
    }

    @Override
    public void price() {
        System.out.println("가격이 비싸다.");
    }
}
