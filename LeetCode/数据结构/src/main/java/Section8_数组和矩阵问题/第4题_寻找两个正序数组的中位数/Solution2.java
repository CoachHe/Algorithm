package Section8_数组和矩阵问题.第4题_寻找两个正序数组的中位数;

public class Solution2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left1 = 0, left2 = 0, right1 = nums1.length - 1, right2 = nums2.length - 1;
        int middle1 = 0, middle2 = 0;
        while (left1 < right1 || left2 < right2) {
            if (right1 < 0 || right2 < 0) {
                break;
            }
            middle1 = (left1 + right1) / 2;
            middle2 = (left2 + right2) / 2;
            if (nums1[middle1] < nums2[middle2]) {
                left1 = middle1 + 1;
                right2 = middle2 - 1;
            } else {
                right1 = middle1 - 1;
                left2 = middle2 + 1;
            }
        }
        System.out.println("left1 = " + left1);
        System.out.println("left2 = " + left2);
        System.out.println("right1 = " + right1);
        System.out.println("right2 = " + right2);
        if (left1 == right1) {
            if (nums1[left1] > nums2[left2]) {
                return nums2[left2];
            } else if (right2 != -1){
                return Math.max(nums1[left1], nums2[right2]);
            } else {
                return nums1[left1];
            }
        } else if (left2 == right2) {
            if (nums2[left2] > nums1[left1]) {
                return nums1[left1];
            } else if (right1 != -1){
                return Math.max(nums2[left2], nums1[right1]);
            } else {
                return nums2[left2];
            }
        }
        return ((double)nums1[left1] + (double)nums2[left2]) / 2;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{};
        System.out.println(s.findMedianSortedArrays(nums1, nums2));

    }
}
