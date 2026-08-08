package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {20, 42, 6, 25, 30, 88};

        int max = arr[0];
        int Smax = arr[1];

        if (arr[0] > arr[1]) {
            max = arr[0];
            Smax = arr[1];
        } else {
            max = arr[1];
            Smax = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                Smax = max;
                max = arr[i];
            } else if (arr[i] > Smax) {
                Smax = arr[i];
            }
        }
        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + Smax);
    }
}