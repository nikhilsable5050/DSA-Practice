package Basics;

import java.util.Scanner;

public class CountSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no :");
        int n = sc.nextInt();

        int sum;
        for(sum = 0; n != 0; n /= 10) {
            int digit = n % 10;
            sum += digit;
        }

        System.out.println(sum);
    }
}