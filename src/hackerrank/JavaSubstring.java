package hackerrank;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input string
        String str = scanner.next();

        // Input start and end index
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // substring(start, end)
        // end index is excluded
        String result = str.substring(start, end);

        // Print substring
        System.out.println(result);
    }
}