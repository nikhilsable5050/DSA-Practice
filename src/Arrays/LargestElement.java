package Arrays;

public class LargestElement {
    public static void main(String[] args){
        int[] arr = {3,5,2,7,4};
        int Largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> Largest){
                Largest = arr[i];
            }
        }
        System.out.println(Largest);
    }
}
