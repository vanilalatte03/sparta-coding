package chapter3.exception;

public class Main {
    public static void main(String[] args) {
        ExceptionPractice exceptionPractice = new ExceptionPractice();

        exceptionPractice.callUncheckedException();
        try {
            exceptionPractice.callUncheckedException();
        } catch (RuntimeException e){
            System.out.println("언체크 예외 처리");

        }
        System.out.println("프로그램 종료");

        try {
            exceptionPractice.callCheckedException();
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }
    }
}
