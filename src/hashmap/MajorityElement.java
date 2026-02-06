package hashmap;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (map.get(arr[i]) > n / 2) {
                System.out.println("Majority element: " + arr[i]);
                break;
            }
        }
    }
}
