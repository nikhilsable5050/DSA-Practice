package Arrays;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        boolean isSorted = true;

        // We go up to length - 1 so i + 1 doesn't go out of bounds
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break; // No need to keep checking once we find an error
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is unsorted.");
        }
    }
}