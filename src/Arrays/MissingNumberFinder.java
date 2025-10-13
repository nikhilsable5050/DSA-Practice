package Arrays;

public class MissingNumberFinder {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5};  // Missing number = 3
        int n = 5; // Total numbers should be from 1 to 5

        int sum1 = 0;
        for(int i = 0; i < arr.length; i++){
            sum1 += arr[i];
        }
        System.out.println("Sum of elements in array: " + sum1);

        int sum2 = 0;
        for(int i = 1; i <= n; i++){
            sum2 += i;
        }
        System.out.println("Sum of range elements (1 to " + n + "): " + sum2);

        System.out.println("Missing number is: " + (sum2 - sum1));
    }
}
