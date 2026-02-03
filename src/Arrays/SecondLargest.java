package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        // Example array with duplicates and different values
        int[] arr = {10, 20, 4, 20, 15};

        int result = findSecondLargest(arr);

        if (result == -1) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + result);
        }
    }

    public static int findSecondLargest(int[] arr) {
        // Initialize with very small values to handle any positive integers
        int max = -1;
        int secondMax = -1;

        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than max
            if (arr[i] > max) {
                secondMax = max; // Old max becomes second max
                max = arr[i];    // Current becomes max
            }
            // If element is between max and secondMax
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}