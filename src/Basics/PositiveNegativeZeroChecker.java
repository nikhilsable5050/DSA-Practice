package Basics;
import java.util.Scanner;

public class PositiveNegativeZeroChecker {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no;");
        int n = sc.nextInt();

        if(n > 0){
            System.out.println("Positive");
        }
        else if (n < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("zero");
        }

    }
}
