package chapter2.inheritance;

abstract class Animal {
    private String name;

    abstract void eat();

    public void sleep() {
        System.out.println("쿨쿨");
    }
}
