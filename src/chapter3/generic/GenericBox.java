package chapter3.generic;

public class GenericBox<T> {
    private T item;

    public GenericBox(T item){
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public void printItem(T item) {
        System.out.println(item);
    }

    public <S> void printBoxItem(S item) {
        System.out.println(item);
    }
}
