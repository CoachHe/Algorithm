package Section8_数组和矩阵问题.第136题_只出现一次的数字;

import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1] && nums[i - 1] == nums[i - 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{2, 2, 1};
        int[] arr2 = new int[]{4,1,2,1,2};
        System.out.println(s.singleNumber(arr));
        System.out.println(s.singleNumber(arr2));
    }
}
