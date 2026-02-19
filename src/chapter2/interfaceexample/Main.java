package chapter2.interfaceexample;

public class Main {
    public static void main(String[] args) {
        TeslaCar teslaCar = new TeslaCar();
        MorningCar morningCar = new MorningCar();

        morningCar.price();
        morningCar.drive();

        teslaCar.price();
        teslaCar.drive();
    }
}
