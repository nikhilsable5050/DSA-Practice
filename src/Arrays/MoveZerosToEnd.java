package Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 2, 3};
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[z];
                arr[z] = temp;
                z++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}