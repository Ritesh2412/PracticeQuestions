package org.example.dsa.hashing;

import java.util.*;

public class CountDistinctElements {

    public static int countDistinct(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(countDistinct(new int[]{1, 2, 2, 3, 1, 4})); // 4
        System.out.println(countDistinct(new int[]{5, 5, 5, 5}));       // 1
    }
}
