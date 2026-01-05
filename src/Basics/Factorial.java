package Basics;
import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your no:");
        int n = sc.nextInt();

        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}


/*
public class Factorial {
    static int Fact(int n) {
        int result = 1;

        for(int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no :");
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
 */