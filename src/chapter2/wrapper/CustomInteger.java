package chapter2.wrapper;

public final class CustomInteger {
    private final int value;

    public CustomInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
