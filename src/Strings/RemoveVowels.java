package Strings;

import java.util.DoubleSummaryStatistics;

public class RemoveVowels {
    public static void main(String[] args){
        String str = "Hello Word";

        String result = str.replaceAll("[AEIOUaeiou]","");

        System.out.println("Orginal :" + str);
        System.out.println("Without vowels :" + result);

    }
}
