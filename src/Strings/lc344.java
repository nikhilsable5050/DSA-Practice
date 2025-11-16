package Strings;

public class lc344 {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);

        // print the result
        for (char c : s) {
            System.out.print(c);
        }
    }

    // method should be OUTSIDE main()
    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
