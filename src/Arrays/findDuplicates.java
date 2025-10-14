package Arrays;


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
