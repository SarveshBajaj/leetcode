package main.java.com.example.leetcodeproject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueCharacter {

    public static int firstUniqueChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, -1);
            } else {
                map.put(c, i);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != -1)
                return entry.getValue();
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("aabb"));
    }
}
