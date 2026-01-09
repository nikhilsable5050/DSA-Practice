package Basics.Numbers;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();

        // Edge case: numbers less than or equal to 1 are not prime
        if (n <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }

        boolean isPrime = true;

        // Check divisibility from 2 to n-1
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}
