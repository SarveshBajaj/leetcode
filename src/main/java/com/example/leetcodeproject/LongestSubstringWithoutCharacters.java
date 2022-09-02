package com.example.leetcodeproject;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Math.max;

public class LongestSubstringWithoutCharacters {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                Iterator<Character> it = map.keySet().iterator();
                while(it.hasNext() && (it.next().equals(s.charAt(i)) || map.containsKey(s.charAt(i))))
                    it.remove();
            }
            map.put(s.charAt(i), 1);
            val = max(val, map.size());
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }
}
