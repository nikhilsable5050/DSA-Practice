/*
public class MirrorRightAngle {
    public static void main(String[] args){
        int i;
        int j;
        int k;
        int n=10;
        for(i=1;i<=n;i++){
            for(k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

 */
public class MirrorRightAngle {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
