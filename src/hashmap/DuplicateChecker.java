package hashmap;

import java.util.HashMap;

public class DuplicateChecker {
    public static void main(String[] args){
        int[] nums = {10, 20, 30, 10, 40};

        HashMap<Integer,Integer> map = new HashMap<>();
        boolean hasDuplicates = false;

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                hasDuplicates = true;
                break;
            }
            map.put(nums[i],i);
        }
        System.out.println("Has duplicates: " + hasDuplicates);
    }
}
