package Arrays;
import java.util.Scanner;
public class AvgOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];

        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();   // ✅ Taking input
            sum = sum + arr[i];      // ✅ Adding to sum
        }
        double avg = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        sc.close();
    }
}