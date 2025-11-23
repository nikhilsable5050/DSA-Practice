package Basics;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lines :");

        for(int l = 1; sc.hasNextLine(); ++l) {
            String readLine = sc.nextLine();
            System.out.println(l + " " + readLine);
        }

    }
}