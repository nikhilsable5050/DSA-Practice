package Searching.LinearSearch;

public class FindKey {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {50, 10, 33, 40, 26};
        int key = 40;

        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}
