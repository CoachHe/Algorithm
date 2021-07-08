package Section8_数组和矩阵问题.第4题_寻找两个正序数组的中位数;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left1 = 0, left2 = 0, right1 = nums1.length - 1, right2 = nums2.length - 1;
        while (left1 < right1 || left2 < right2) {
            if (left1 >= right1) {
                left2++;
                right2--;
            } else if (left2 >= right2) {
                left1++;
                right1--;
            } else {
                if (nums1[left1] <= nums2[left2]) {
                    left1++;
                } else {
                    left2++;
                }
                if (nums1[right1] >= nums2[right2]) {
                    right1--;
                } else {
                    right2--;
                }
            }
        }
        double left;
        double right;
        if (Math.abs(right1 - left1 + right2 - left2) == 1) {
            if (left1 == right1) {
                int tmp1 = nums1[left1];
                int tmp2 = nums2[left2];
                int tmp3 = nums2[right2];
                if (tmp1 > tmp2 && tmp1 < tmp3) {
                    return tmp1;
                } else if (tmp1 > tmp3) {
                    return tmp2;
                } else {
                    return tmp3;
                }
            } else {
                int tmp1 = nums1[left1];
                int tmp2 = nums1[right1];
                int tmp3 = nums2[right2];
                if (tmp3 > tmp2 && tmp1 < tmp3) {
                    return tmp1;
                } else if (tmp1 > tmp3) {
                    return tmp2;
                } else {
                    return tmp3;
                }

            }

        }
        if (nums1.length == 0) {
            left = nums2[left2];
            right = nums2[right2];
        } else if (nums2.length == 0) {
            left = nums1[left1];
            right = nums1[right1];
        } else {
            left = Math.max(nums1[left1], nums2[left2]);
            right = Math.min(nums1[right1], nums2[right2]);
        }
        return (left + right) /  2;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3};
        int[] nums2 = new int[]{-2,-1};
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(nums1, nums2));

    }

}
