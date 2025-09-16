package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(lengthOfLastWord(str));
    }

    static int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;

        for(int i = str.length() - 1; i >= 0 && str.charAt(i) != ' '; --i) {
            ++count;
        }

        return count;
    }
}