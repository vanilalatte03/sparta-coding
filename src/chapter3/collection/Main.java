package chapter3.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("jiho");
        hashSet.add("jiho2");
        hashSet.add("1");
        hashSet.add("2");

        System.out.println(hashSet);

        hashSet.add("jiho");
        System.out.println(hashSet);

        hashSet.remove("jiho2");
        System.out.println(hashSet);


        //hashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("jiho", 12);
        map.put("jiho2", 23);
        map.put("jiho3", 1);
        map.put("jiho4", 245);
        map.put("jiho5", 32);

        System.out.println(map);

        Integer jihoNum = map.get("jiho2");
        System.out.println(jihoNum);

        map.remove("jiho5");
        System.out.println(map);
        
        //키 확인
        Set<String> keys = map.keySet();
        System.out.println(keys);

        //값 확인
        Collection<Integer> values = map.values();
        System.out.println(values);
    }
}
