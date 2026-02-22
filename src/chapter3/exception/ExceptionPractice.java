package chapter3.exception;

public class ExceptionPractice {

    public void callUncheckedException() {
        try {
            if(true) {
                System.out.println("언체크 예외 발생");
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("언체크 예외 처리");
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }
    }

    public void callCheckedException() throws Exception{
        if (true){
            System.out.println("체크 예외 발생");
            throw new Exception();
        }


    }
}
