package Section5_字符串问题.第485题_最大连续1的个数;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                tmp = 0;
            } else {
                tmp++;
            }
            max = Math.max(max, tmp);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{1,1,0,1,1,1};
        System.out.println(s.findMaxConsecutiveOnes(nums));
    }
}
