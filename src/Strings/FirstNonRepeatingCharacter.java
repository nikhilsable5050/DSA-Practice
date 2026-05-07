package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String s) {

        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (char ch : s.toCharArray()) {
            if (freq.get(ch) == 1) {
                return ch;
            }
        }

        return '#';
    }

    public static void main(String[] args) {

        System.out.println(firstNonRepeating("aabbcddee"));
        System.out.println(firstNonRepeating("leetcode"));
        System.out.println(firstNonRepeating("aabbcc"));
    }
}