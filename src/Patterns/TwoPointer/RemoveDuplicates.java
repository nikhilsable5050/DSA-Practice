package Patterns.TwoPointer;

public class RemoveDuplicates {

    public static int removeDuplicate(int[] arr){

        if(arr.length == 0) return 0;

        int i = 0;

        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args){

        int[] arr = {2,2,3,3,4,6,6};

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int newLength = removeDuplicate(arr);   // store result

        System.out.println(" ");

        for(int i = 0; i < newLength; i++){     // print only valid part
            System.out.print(arr[i] + " ");
        }
    }
}