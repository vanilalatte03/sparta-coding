package mission0227_1;

import java.util.*;

public class WordGame {
    private static final String[] words= {
            "airplane", "apple", "arm", "bakery", "banana", "bank", "bean", "belt",
            "bicycle", "biography", "blackboard", "boat", "bowl", "broccoli", "bus",
            "car", "carrot", "chair", "cherry", "cinema", "class", "classroom", "cloud",
            "coat", "cucumber", "desk", "dictionary", "dress", "ear", "eye", "fog",
            "foot", "fork", "fruits", "hail", "hand", "head", "helicopter", "hospital",
            "ice", "jacket", "kettle", "knife", "leg", "lettuce", "library", "magazine",
            "mango", "melon", "motorcycle", "mouth", "newspaper", "nose", "notebook",
            "novel", "onion", "orange", "peach", "pharmacy", "pineapple", "plate", "pot",
            "potato", "rain", "shirt", "shoe", "shop", "sink", "skateboard", "ski",
            "skirt", "sky", "snow", "sock", "spinach", "spoon", "stationary", "stomach",
            "strawberry", "student", "sun", "supermarket", "sweater", "teacher",
            "thunderstorm", "tomato", "trousers", "truck", "vegetables", "vehicles",
            "watermelon", "wind"
    };

    public static void main(String[] args) {
        Random random = new Random();
        String word = words[random.nextInt(words.length)].toUpperCase();
        char[] display = "_".repeat(word.length()).toCharArray();
        System.out.print("자리수: ");
        System.out.println(display);

        Set<Character> used = new HashSet<>();
        int chances = 9;
        Scanner sc = new Scanner(System.in);

        while (chances > 0 && new String(display).contains("_")){
            System.out.println("남은 기회 " + chances);
            System.out.println(new String(display));

            System.out.println("알파벳 입력!");
            String input = sc.next().toUpperCase();

            if(input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("알파벳 한 글자만 입력해주세요.");
                continue;
            }

            char c = input.charAt(0);
            if (used.contains(c)) {
                System.out.println("이미 입력한 알파벳입니다.");
                continue;
            }
            used.add(c);

            boolean found = false;
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == c) {
                    display[i] = c;
                    found = true;
                }
            }

            if (!found) {
                System.out.println("틀렸습니다!");
                chances--;
            }

        }

        System.out.println(new String(display).contains("_") ? "게임오버! 정답:" + word : "정답입니다! 정답: " + word);

    }

}
