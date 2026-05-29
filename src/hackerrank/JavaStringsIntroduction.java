package hackerrank;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        // Sum of lengths
        System.out.println(A.length() + B.length());

        // Lexicographical comparison
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize first letter
        String capitalA =
                A.substring(0, 1).toUpperCase() + A.substring(1);

        String capitalB =
                B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print final output
        System.out.println(capitalA + " " + capitalB);
    }
}