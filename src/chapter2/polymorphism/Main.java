package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.exist();
        animal.makeSound();

        Cat cat = (Cat) animal;
        cat.scratch();

        Animal animal1 = new Dog();

        if (animal1 instanceof Cat) {
            Cat cat1 = (Cat) animal1;
            cat1.scratch();
        } else {
            System.out.println("고양이가 아님");
        }
    }
}
