package Arrays;

import java.util.HashMap;
public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 5, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                //This number is already in the HashMap. Get its current count, add 1, and update the count
            } else {
                map.put(arr[i], 1);
            }
        }

        // Print duplicates
        System.out.println("Duplicates are:");

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                System.out.println(arr[i]);

                // Mark as printed
                map.put(arr[i], 0);
                //Update the frequency of the current element to 0 after printing it.
            }
        }
    }
}

/*
public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,2,7,2,9,4,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }

}

 */

/*
import java.util.Arrays;
public class findDuplicates {
    public static void main(String[] args) {
        findDuplicates s = new findDuplicates();
        int[] nums = {1, 3, 4, 2, 2};
        int result = s.findDuplicate(nums);
        System.out.println("Duplicate number: " + result);
    }
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}

 */


/*
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

    public class findDuplicates {
        public static Set<Integer> findDuplicatesBySorting(int[] arr) {
            // Sort the array first
            Arrays.sort(arr);
            Set<Integer> duplicates = new HashSet<>();
            for (int i = 1; i < arr.length; i++) {
                // If the current element is the same as the previous one, it's a duplicate
                if (arr[i] == arr[i - 1]) {
                    duplicates.add(arr[i]);
                }
            }
            return duplicates;
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 3, 5, 6, 1, 7, 8, 8};
            Set<Integer> duplicateNumbers = findDuplicatesBySorting(numbers);
            System.out.println("Input Array: " + Arrays.toString(new int[]{1, 2, 3, 4, 3, 5, 6, 1, 7, 8, 8}));
            System.out.println("Duplicate numbers are: " + duplicateNumbers); // Output: [1, 3, 8]
        }
}


 */