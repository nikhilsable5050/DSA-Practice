package Strings;

import static java.util.Collections.reverse;

public class ReverseString {
    public static void main (String[] args){
      /*
        // StringBuilder does the same work as buffer
        StringBuffer obj = new StringBuffer("Nikhil Sable");
        System.out.println(obj.reverse());



       */

        String str = "Nikhil Sable";
        String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}
