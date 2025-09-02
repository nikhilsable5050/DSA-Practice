public class PalimdromeNum {
    public static void main(String[] args){
        int n = 1211;
        int orgNum = n;
        int rev = 0;

        while(n > 0){
            int digit = n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.println(rev);
        if(orgNum == rev){
            System.out.println("Its palimdrome");
        }
        else {
            System.out.println("Not palimdrome");
        }
    }
}
