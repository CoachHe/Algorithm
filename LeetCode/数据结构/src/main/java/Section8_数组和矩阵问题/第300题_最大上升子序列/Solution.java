package Section8_数组和矩阵问题.第300题_最大上升子序列;

public class Solution {


    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] data = new int[len];
        data[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int tmp_len = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    tmp_len = Math.max(tmp_len, data[j]);
                }
            }
            data[i] = tmp_len + 1;
        }
        int res = 1;
        for (int tmp : data) {
            res = Math.max(tmp, res);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
