package Strings;

public class StringPalindrome {

    public static void main(String[] args) {
        /*
        String str = "madam";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
     */


       /*
        //Tow Pointer appr
        String str = "madam";
        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not");
        }

        */


        /*
        String s1 = "madam";
        String res = "";
        for(int i=s1.length()-1;i>=0;i--){
            res = res + s1.charAt(i);
        }
        if(s1.equals(res)){
            System.out.println("Palindromme");
        }
        else {
            System.out.println("Not");
        }
         */

        String str = "madam";
        int i = 0;
        int j = str.length()-1;
        boolean isPalindrome = true;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
            else {
                i++;
                j--;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
