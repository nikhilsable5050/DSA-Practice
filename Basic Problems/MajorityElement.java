public class MajorityElement {
    public static void main(String args[]) {
        int nums[] = {1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int nums[]) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}