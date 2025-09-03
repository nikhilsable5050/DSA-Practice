public class TwoSum {
    public static void main(String[] args){
        int[] n = {1,2,3,4,6};
        int target = 6;
        Boolean found = false;
        int left = 0;
        int right = n.length-1;
        
       

        while( left < right){
             int sum = n[left] + n[right];
            if(sum == target){
                System.out.println("Found : " + n[left] + "+" + n[right] + "=" + target);
                found = true;
                break;

            } else if (sum < target){
                left ++;
            } else 
            right --;
        }
        if(!found){
            System.out.println("false " + n[left] +"+"+ n[right]);
        } else{
            System.out.println("true" + n[left] +"+"+ n[right]);
        }
    }
}
