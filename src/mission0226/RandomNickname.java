package mission0226;

import java.util.*;

public class RandomNickname {
    private static final String[] word1 = {"기절초풍", "멋있는", "재미있는"};
    private static final String[] word2 = {"도전적인", "노란색의", "바보같은"};
    private static final String[] word3 = {"돌고래", "개발자", "오랑우탄"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomNickname randomNickname = new RandomNickname();
        String myNickname = randomNickname.createRandomNickname(sc.next());
        System.out.println(myNickname);
    }

    public String createRandomNickname(String name){
        Random random = new Random();

        int firstIndex = random.nextInt(word1.length);
        int secondIndex = random.nextInt(word2.length);
        int thirdIndex = random.nextInt(word3.length);

        String nickName = word1[firstIndex] + " "
                + word2[secondIndex] + " "
                + word3[thirdIndex] + " " +
                name;

        return nickName;
    }
}
