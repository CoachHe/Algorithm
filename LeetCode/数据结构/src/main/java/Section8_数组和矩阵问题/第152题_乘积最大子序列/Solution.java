package Section8_数组和矩阵问题.第152题_乘积最大子序列;

public class Solution {
    public int maxProduct(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];
        int maxEnd = 0;
        int minEnd = 0;
        for (int i = 1; i < arr.length; i++) {
            maxEnd = max * arr[i];
            minEnd = min * arr[i];
            max = Math.max(Math.max(maxEnd, minEnd), arr[i]);
            min = Math.min(Math.min(maxEnd, minEnd), arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{10, 1, 100};
        System.out.println(s.maxProduct(arr));
    }
}
