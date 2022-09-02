package com.example.leetcodeproject;

import java.util.*;

public class ReduceArraySizeToHalf {

    public static int minSetSize(int[] arr) {
//        List<Integer>[] list = Arrays.asList(arr);
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.containsKey(j) ? map.get(j) + 1 : 1);
        }

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        double half = Math.ceil((arr.length / 2));
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            half -= entry.getValue();
            count++;
            if (half <= 0)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minSetSize(new int[] {7,7,7,7,7,7}));
    }
}
