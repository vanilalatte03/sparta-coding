package mission0226;

import java.util.Random;
import java.util.Scanner;

public class RandomNickname {
    private static final String[] WORD1 = {"기절초풍", "멋있는", "재미있는"};
    private static final String[] WORD2 = {"도전적인", "노란색의", "바보같은"};
    private static final String[] WORD3 = {"돌고래", "개발자", "오랑우탄"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomNickname randomNickname = new RandomNickname();
        String myNickname = randomNickname.createRandomNickname(sc.next());
        System.out.println(myNickname);
    }

    public String createRandomNickname(String name){
        Random random = new Random();

        int firstWord = random.nextInt(WORD1.length);
        int secondWord = random.nextInt(WORD2.length);
        int thirdWord = random.nextInt(WORD3.length);

        String nickName = WORD1[firstWord] + " "
                + WORD2[secondWord] + " "
                + WORD3[thirdWord] + " " +
                name;

        return nickName ;
    }
}
