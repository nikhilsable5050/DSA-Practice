package hackerrank;

import java.util.Scanner;

public class StaticInitializationBlock {

    // Static variables
    static int breadth;
    static int height;
    static boolean isValid = true;

    // Static Initialization Block
    static {

        Scanner scanner = new Scanner(System.in);

        breadth = scanner.nextInt();
        height = scanner.nextInt();

        try {

            // Validate input
            if (breadth <= 0 || height <= 0) {

                isValid = false;

                throw new Exception("Breadth and height must be positive");
            }

        } catch (Exception e) {

            System.out.println("java.lang.Exception: " + e.getMessage());
        }
    }

    // Main Method
    public static void main(String[] args) {

        if (isValid) {

            int area = breadth * height;

            System.out.println("Area of Parallelogram: " + area);
        }
    }
}