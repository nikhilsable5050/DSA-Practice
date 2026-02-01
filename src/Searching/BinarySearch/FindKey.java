package Searching.BinarySearch;

// Binary search implementation to find a key in sorted array
public class FindKey {
    public static int binarySearch(int[] arr, int key) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2; // safe mid calculation
            if (arr[mid] == key) {
                return mid; // key found
            } else if (key < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1; // key not found
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 12, 15, 16, 19, 21};
        int key = 13;

        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}
