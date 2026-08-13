package Strings;

import java.util.HashMap;

public class FindDuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Find duplicates
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.get(ch) > 1) {
                System.out.println(ch);
                map.put(ch, 0);
            }
        }
    }
}