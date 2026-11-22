package org.example.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String s = "banana";
        Map<Character, Integer> freq = charFrequency(s);

        // Print in alphabetical order by walking a..z
        for (char c = 'a'; c <= 'z'; c++) {
            if (freq.containsKey(c)) {
                System.out.println(c + " → " + freq.get(c));
            }
        }
    }
}