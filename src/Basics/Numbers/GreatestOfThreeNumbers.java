package Basics.Numbers;
import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int a = sc.nextInt();

        System.out.println("Enter your second number:");
        int b = sc.nextInt();

        System.out.println("Enter your third number:");
        int c = sc.nextInt();

        if(a >= b && a >= c){
            System.out.println("Greatest number is: " + a);
        }
        else if(b >= a && b >= c){
            System.out.println("Greatest number is: " + b);
        }
        else{
            System.out.println("Greatest number is: " + c);
        }

        sc.close();
    }
}
