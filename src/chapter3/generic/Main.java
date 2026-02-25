package chapter3.generic;

public class Main {
    public static void main(String[] args) {
        GenericBox<String> strGBox = new GenericBox<>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<>(100);
        GenericBox<Double> doubleGBox = new GenericBox<>(0.1);

        String strGBoxItem = strGBox.getItem();
        Integer intGboxItem = intGBox.getItem();
        Double doubleGboxItem = doubleGBox.getItem();
        System.out.println("strGBoxItem= " + strGBoxItem);
        System.out.println("intGboxItem= " + intGboxItem);
        System.out.println("doubleGboxItem= " + doubleGboxItem);


        strGBox.printItem("ABC");
        //strGBox.printItem(100);

        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(100);
        strGBox.printBoxItem(0.1);

    }
}
