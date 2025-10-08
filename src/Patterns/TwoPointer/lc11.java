package Patterns.TwoPointer;

public class lc11 {

        public static void main(String[] args) {
            int[] height = {1,8,6,2,5,4,8,3,7};  // sample input
            Solution solution = new Solution();
            int result = solution.maxArea(height);
            System.out.println("Maximum water area: " + result);
        }
    }

    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int maxArea = 0;

            while (left < right) {
                int h = Math.min(height[left], height[right]);
                int width = right - left;
                int area = h * width;

                maxArea = Math.max(maxArea, area);

                // Move pointer pointing to shorter line
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return maxArea;
        }


}

