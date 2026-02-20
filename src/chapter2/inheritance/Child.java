package chapter2.inheritance;

public class Child extends Parent{

    public String familyName = "Lim";

    public Child() {
        super();
    }

    public void superExample() {
        System.out.println("우리 " + this.familyName + "가문은...");
        System.out.println("원래 가문의 이름은 " + super.familyName);
    }

    @Override
    public void introduceFamily() {
        System.out.println("오버라이드");
    }
}
