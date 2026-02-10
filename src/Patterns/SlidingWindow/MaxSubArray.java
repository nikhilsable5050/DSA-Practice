package Patterns.SlidingWindow;

public class MaxSubArray {

    static int maxSubArray(int[] arr, int k){

        int wSum = 0;
        int mSum;

        // Step 1: Calculate first window sum
        for(int i = 0; i < k; i++){
            wSum += arr[i];
        }

        // Step 2: First window itself can be max
        mSum = wSum;

        // Step 3: Slide the window
        for(int i = k; i < arr.length; i++){

            // remove outgoing element & add incoming element
            wSum = wSum - arr[i - k] + arr[i];

            // update maximum sum
            mSum = Math.max(mSum, wSum);
        }

        return mSum;
    }

    public static void main(String[] args){
        int[] arr = {2, 9, 31, -4, 21, 7};
        int k = 3;

        System.out.println(maxSubArray(arr, k));
    }
}
