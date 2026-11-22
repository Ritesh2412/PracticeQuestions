package org.example.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyElement {
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 1, 2};
        System.out.println(highestFrequency1(nums));
    }

    public static int highestFrequency1(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int result = nums[0];
        int maxFreq = 0;

        for (int num : nums) {
            int f = freq.get(num);
            if (f > maxFreq) {
                maxFreq = f;
                result = num;
            }
        }
        return result;
    }
}
