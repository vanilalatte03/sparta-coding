package mission0226;

import java.util.Random;
import java.util.Scanner;

public class RandomNickname {
    private static final String[] Word1 = {"기절초풍", "멋있는", "재미있는"};
    private static final String[] Word2 = {"도전적인", "노란색의", "바보같은"};
    private static final String[] Word3 = {"돌고래", "개발자", "오랑우탄"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomNickname randomNickname = new RandomNickname();
        String myNickname = randomNickname.createRandomNickname(sc.next());
        System.out.println(myNickname);
    }

    public String createRandomNickname(String name){
        Random random = new Random();

        int firstWord = random.nextInt(Word1.length);
        int secondWord = random.nextInt(Word2.length);
        int thirdWord = random.nextInt(Word3.length);

        String nickName = Word1[firstWord] + " "
                + Word2[secondWord] + " "
                + Word3[thirdWord] + " " +
                name;

        return nickName ;
    }
}
