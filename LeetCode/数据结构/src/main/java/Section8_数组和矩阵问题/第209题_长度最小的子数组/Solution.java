package Section8_数组和矩阵问题.第209题_长度最小的子数组;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int tmpsum = nums[0];
        int tmplen = 1;
        int minlen = Integer.MAX_VALUE;
        int left = 0;
        int right = 1;
        while (right <= nums.length - 1) {
            if (tmpsum + nums[right] >= s) {
                tmplen = right - left + 1;
                if (tmplen < minlen) {
                    minlen = tmplen;
                }
                tmpsum -= nums[left++];
            } else {
                tmpsum += nums[right++];
            }
        }
        return minlen;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minSubArrayLen(7, new int[]{10,2,3}));
    }

}