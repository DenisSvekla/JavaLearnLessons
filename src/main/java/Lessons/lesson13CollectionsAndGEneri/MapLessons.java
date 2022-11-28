package Lessons.lesson13CollectionsAndGEneri;

import java.util.HashMap;

public class MapLessons {
    public static void main(String[] args) {
        int x =1;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,666);
        hashMap.put(2,677);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap);
        hashMap.get(2);
    }
}
