package hashmap;

import java.util.HashMap;

public class StringFrequency {
    public static void main(String[] args) {

        String str = "banana";

        // HashMap to store character and frequency
        HashMap<Character, Integer> map = new HashMap<>();

        // Loop through string characters
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i); // current character

            // If character already exists → increase count
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                //containsKey version → no need for 0
                //getOrDefault version → 0 is needed
            }
            // Otherwise add with count = 1
            else {
                map.put(c, 1);
            }
        }

        // Print frequency
        System.out.println(map);
    }
}
