package Section8_数组和矩阵问题.第53题_最大子序和;

class Solution {
    public int maxSubArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int cur = 0;

        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];
            max = Math.max(max, cur);
            cur = cur < 0 ? 0 : cur;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{-2,1};
        System.out.println(s.maxSubArray(arr));
    }
}
