package Patterns.SlidingWindow;

import java.util.Arrays;

public class AvgSubArray {

    static double[] findAverages(int[] arr, int k) {

        // Number of subarrays possible = arr.length - k + 1
        // So result array stores all averages
        double[] result = new double[arr.length - k + 1];

        int wSum = 0;   // current window sum
        int index = 0;  // index to store averages

        // Step 1: Calculate sum of first window
        for (int i = 0; i < k; i++) {
            wSum += arr[i];
        }

        // Store average of first window
        result[index] = (double) wSum / k;
        index = index + 1;

        // Step 2: Slide window across array
        for (int i = k; i < arr.length; i++) {

            // Remove element leaving the window
            wSum = wSum - arr[i - k];

            // Add new element entering the window
            wSum = wSum + arr[i];

            // Store average of current window
            result[index] = (double) wSum / k;
            index = index + 1;
        }

        // Return all averages
        return result;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};

        int k = 5;  // window size

        // Call function
        double[] ans = findAverages(arr, k);

        // Print result
        System.out.println(Arrays.toString(ans));
    }
}
