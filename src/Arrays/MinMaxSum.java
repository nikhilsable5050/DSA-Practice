package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 Problem: Mini-Max Sum
 Given five positive integers, find the minimum and maximum values
 that can be calculated by summing exactly four of the five integers.
 Print the respective minimum and maximum sums.
*/

public class MinMaxSum {

    public static void miniMaxSum(long[] arr) {

        Arrays.sort(arr);

        long minSum = 0;
        long maxSum = 0;

        // Minimum sum (first four numbers)
        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
        }

        // Maximum sum (last four numbers)
        for (int i = 1; i < 5; i++) {
            maxSum += arr[i];
        }

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long[] arr = new long[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }

        miniMaxSum(arr);

        sc.close();
    }
}
