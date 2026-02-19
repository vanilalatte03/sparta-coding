package mission0219;

import java.util.Scanner;

public class conditionalStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("현재 상황을 입력하세요.\n1. 운동 전\n2. 운동 후\n3. 식사 대용\n4. 취침 전\n");
        int condition = sc.nextInt();

        if (condition < 1 || condition > 4) {
            System.out.println("1~4 사이의 숫자만 입력해주세요.");
            return;
        }

        if (condition == 1) {
            System.out.println("운동 전: 탄수/에너지 위주 (바나나 + 우유 300ml + 프로틴 30g)");
        } else if (condition == 2) {
            System.out.println("운동 후: 단백질 위주 (두유 300ml + 프로틴 30g + 땅콩버터 1T)");
        } else if (condition == 3) {
            System.out.println("식사 대용: 포만감 (두유 300ml + 미숫가루 3T + 프로틴 30g)");
        } else {
            System.out.println("취침 전: 소화 (물 150ml + 프로틴 30g)");
        }

        switch (condition) {
            case 1:
            case 2:
                System.out.println("운동 효율을 높이는 레시피를 적용했어요.");
                break;
            case 3:
                System.out.println("든든한 한 끼를 위한 레시피를 적용했어요.");
                break;
            case 4:
                System.out.println("휴식을 위한 레시피를 적용했어요.");
                break;
        }
    }
}
