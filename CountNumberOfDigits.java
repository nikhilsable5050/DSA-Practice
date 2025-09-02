import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int original = n; // keep the original number
        int count = 0;

        while (n != 0) {
            n /= 10;   // divide by 10 each time
            count++;
        }

        System.out.println("Digits in " + original + " = " + count);
    }
}
