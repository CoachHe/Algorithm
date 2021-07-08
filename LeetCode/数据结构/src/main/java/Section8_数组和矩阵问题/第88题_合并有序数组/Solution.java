package Section8_数组和矩阵问题.第88题_合并有序数组;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m != 0 || n != 0) {
            if (m == 0) {
                for (int i = 0; i < n; i++) {
                    nums1[i] = nums2[i];
                }
                return;
            } else if (n == 0) {
                return;
            }
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        s.merge(nums1, 3, nums2, 3);
        for (int tmp : nums1) {
            System.out.print(tmp + " ");
        }
    }
}