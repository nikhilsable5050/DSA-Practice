package hashmap;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args){
        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){

        // 1. length check
        if(s.length() != t.length()){
            return false;
        }

        // 2. frequency map
        HashMap<Character, Integer> map = new HashMap<>();

        // store frequency of s
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //(existing value OR 0) + 1
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // reduce frequency using t
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);

            if(!map.containsKey(c) || map.get(c) == 0){
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
