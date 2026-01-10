package Strings;
import java.util.Scanner;

public class CountWords {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        int count = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                count++;
            }
        }

        if(sentence.length() > 0){
            count = count + 1;  // +1 because number of words = number of spaces + 1 (last word has no space)
        }

        System.out.println("Word count: " + count);
        sc.close();
    }
}
