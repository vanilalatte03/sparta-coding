package mission0226_2;

import java.util.*;

public class SpartaVendingMachine {
    public static void main(String[] args) {
        System.out.println("음료를 골라주세요!");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("사이다", 1700);
        map.put("콜라", 1900);
        map.put("식혜", 2500);
        map.put("솔의눈", 3000);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("- " + entry.getKey() + " " + entry.getValue() + "원");
        }

        Scanner sc = new Scanner(System.in);
        String choose = sc.nextLine();

        //없으면 종료
        if(!map.containsKey(choose)){
            System.out.println("상품이 없습니다.");
            return;
        }

        int price = map.get(choose);

        System.out.println("돈을 넣어주세요!");
        int money = sc.nextInt();

        if(money < price) {
            System.out.println("돈이 부족합니다.");
        } else {
            System.out.println("잔액 : " +(money - price) + "원");
        }

    }
}
