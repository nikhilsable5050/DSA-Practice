package Arrays;

public class Sort123 {
    public static void main(String[] args){
        int[] arr = {1,3,2,2,1,3,2,1,3};
        int one=0;
        int two=0;
        int three=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                one++;
            } else if(arr[i] ==2){
                two++;
            } else
                three++;
        }
        int index = 0;

        for(int i = 0; i < one; i++){
            arr[index] = 1;
            index++;
        }

        for(int i = 0; i < two; i++){
            arr[index] = 2;
            index++;
        }

        for(int i = 0; i < three; i++){
            arr[index] = 3;
            index++;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
