public class LengthOfLastWord {

    public static void main(String[] args){
        String str="Hello world";
        System.out.println(lengthOfLastWord(str));
    }

    static int lengthOfLastWord(String s){
        String str = s.trim(); 
        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) != ' '){   // <-- fixed here
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
