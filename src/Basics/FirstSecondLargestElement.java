package Basics;

import java.util.Arrays;

public class FirstSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 5, 76, 345, 1, 12, 354};
        Arrays.sort(arr);
        int firstMax = arr[arr.length - 1];
        int secondMax = arr[arr.length - 2];
        System.out.println("Largest = " + firstMax);
        System.out.println("Second Largest = " + secondMax);
    }
}
