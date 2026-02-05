package hashmap;
import java.util.HashMap;

public class ArrayFrequency {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        HashMap<Integer, Integer> freq = new HashMap<>();

        //Traverse array
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i]; // current number

            //  Check if number already exists
            if (freq.containsKey(num)) {

                // Number exists → increase count
                freq.put(num, freq.get(num) + 1);

            } else {

                // Number appears first time → count = 1
                freq.put(num, 1);
            }
        }

        // Step 5: Print frequency result
        System.out.println(freq);
    }
}
