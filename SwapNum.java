public class SwapNum {
public static void main(String[] args){
 int a = 1;
 int b = 2;
 System.out.println("Before ;" + a + b);
 /*
 t=a;
 a=b;
 b=t;
  */
 a=a+b;
 b=a-b;
 a=a-b;
 System.out.println("after :" + a + b);
}
}
