package chapter3.lambda;

public class Main {
    public static void main(String[] args) {
        //익명 클래스
        Calculator calculator1 = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        int ret1 = calculator1.sum(1, 1);
        System.out.println("ret1 = " + ret1);

        //람다 표현식
        Calculator calculator2 = (a,b) -> a + b;
        int ret2 = calculator2.sum(2, 2);
        System.out.println("ret2 = " + ret2);

        int ret3 = calculate(3, 3, calculator1);
        System.out.println("ret3 = " + ret3);

        int ret4 = calculate(4, 4, calculator2);
        System.out.println("ret4 = " + ret4);

        int ret5 = calculate(5, 5, (a,b) -> a + b);
        System.out.println("ret5 = " + ret5);

    }

    public static int calculate(int a, int b, Calculator calculator) {
        return calculator.sum(a, b);
    }
}
