package hashmap;
import java.util.HashMap;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 9, 1, 9, 4, 4, 2, 2, 2, 3, 5, 6, 7, 8, 9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int el = arr[i]; // Get the current number

            // This MUST be inside the loop to check every number
            if (!map.containsKey(el)) {
                map.put(el, 1); // First time seeing this number
            } else {
                map.put(el, map.get(el) + 1); // Increment the existing count
            }
        }
        System.out.println(map);


        // 2. Find the winner
        int maxCount = 0;
        int ansElement = -1;

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            int countOfThisNum = map.get(currentNum); // Look up count in map

            if (countOfThisNum > maxCount) {
                maxCount = countOfThisNum;
                ansElement = currentNum;
            }
        }

        System.out.println("The number " + ansElement + " is the winner with " + maxCount + " appearances.");
    }
}