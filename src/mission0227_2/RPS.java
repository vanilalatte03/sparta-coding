package mission0227_2;

import java.util.*;

//가위바위보
public class RPS {
    private static final List<String> rps = Arrays.asList("바위", "보", "가위");
    static int win, count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        win = 0;
        count = 5;

        Map<Integer, String> gifts = new HashMap<>();
        gifts.put(0, "꽝");
        gifts.put(1, "곰돌이 인형");
        gifts.put(2, "스파르타 랜드 입장권");
        gifts.put(3, "스파르타 캐니언 항공 투어권");
        gifts.put(4, "호텔 스파르타 숙박권");
        gifts.put(5, "스파르테이트 항공권");

        while (count > 0){
            System.out.println("가위 바위 보 중 하나를 입력해주세요!");
            String my_rps = sc.nextLine();
            String com_rps = rps.get(random.nextInt(rps.size()));

            if (!my_rps.equals("바위") && !my_rps.equals("가위") && !my_rps.equals("보")) {
                System.out.println("잘못된 입력입니다!");
                continue;
            }

            Game(my_rps, com_rps);

        }
        System.out.println("축하합니다! 총 " + win + " 회 승리하여 경품으로 [" + gifts.get(win) + "] 을 획득하셨습니다!");
    }

    static void Game(String m, String c) {
        int myIndex = rps.indexOf(m);
        int comIndex = rps.indexOf(c);

        int result = (myIndex - comIndex + 3) % 3;

        System.out.print("당신은 " + m + " 그리고 상대는 " + c + " 로 ");

        if (result == 0) {
            System.out.println("서로 비겼습니다.");
        } else if (result == 1) {
            System.out.println("당신이 이겼습니다.");
            win++;
        } else {
            System.out.println("당신이 졌습니다..");
        }

        count--;
    }

}
