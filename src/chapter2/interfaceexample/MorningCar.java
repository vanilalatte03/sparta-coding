package chapter2.interfaceexample;

public class MorningCar implements Car{

    @Override
    public void drive() {
        System.out.println("잘 달린다.");
    }

    @Override
    public void price() {
        System.out.println("가격이 적당하다.");
    }
}
