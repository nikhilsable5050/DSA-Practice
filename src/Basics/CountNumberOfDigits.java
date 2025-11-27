package Basics;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int original = n;

        int count;
        for(count = 0; n != 0; ++count) {
            n /= 10;
        }

        System.out.println("Digits in " + original + " = " + count);
    }
}
