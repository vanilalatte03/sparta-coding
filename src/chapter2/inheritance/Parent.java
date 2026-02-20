package chapter2.inheritance;

public class Parent {
    public String familyName = "스파르탄";
    public int honor = 10;

    public Parent() {

    }
    public void introduceFamily() {
        System.out.println("우리 " + this.familyName + "가문은 대대로 명성을 이어나갑니다.");
    }
}
