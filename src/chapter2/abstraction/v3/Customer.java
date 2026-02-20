package chapter2.abstraction.v3;

public class Customer implements Salesperson {

    @Override
    public void cal() {
        System.out.println("계산을 합니다.");
    }

    @Override
    public void sale() {
        System.out.println("세일을 합니다.");
    }

    public void buy() {
        System.out.println("물건을 삽니다.");
    }
}
