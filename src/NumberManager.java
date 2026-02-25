import java.util.ArrayList;

public class NumberManager {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 78, 34, 56, 89, 67, 91, 28};

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            // 최대값, 최소값, 합계 계산 코드 작성
            if(numbers[i] > max){
                max = numbers[i];
            } else if (numbers[i] < min){
                min = numbers[i];
            }

            sum += numbers[i];
        }

        // TODO: 평균 계산
        double average = (double) sum / numbers.length;

        // TODO: 짝수만 ArrayList에 저장
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if(num % 2 == 0){
                evenNumbers.add(num);
            }
        }

        // TODO: 결과 출력
        System.out.println("=== 숫자 관리 프로그램 ===");
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("평균값: " + average);
        System.out.println("짝수 목록: " + evenNumbers);
    }
}