package Arrays;

public class FindMaxandMin {

    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 89, 45, 67, -5, 100};

        int max = arr[0];
        int min = arr[0];

        // Loop through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
