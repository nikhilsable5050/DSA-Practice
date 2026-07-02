package Basics;

import java.util.Scanner;

public class CountSumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int digit = n % 10;   // Get last digit
            sum = sum + digit;    // Add it to sum
            n = n / 10;           // Remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}