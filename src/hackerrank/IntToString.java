package hackerrank;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Convert integer to String
        String s = Integer.toString(n);

        // Check conversion
        if (n == Integer.parseInt(s)) {

            System.out.println("Good job");

        } else {

            System.out.println("Wrong answer");
        }
    }
}