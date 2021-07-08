package Section3_二叉树问题.M13_根据后续数组重建搜索二叉树;

public class Solution {
    public boolean isPostArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        return isPost(arr, 0, arr.length - 1);
    }

    public boolean isPost(int[] arr, int start, int end) {
        if (start == end) {
            return true;
        }
        int s1 = start;
        while (start < end && arr[start] < arr[end]) {
            start++;
        }
        if (start == end) {
            return isPost(arr, s1, start - 1);
        }
        int s2 = start;
        while (start < end) {
            if (arr[start] < arr[end]) {
                return false;
            }
            start++;
        }

        return isPost(arr, s1, s2) && isPost(arr, s2, end - 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{2, 1, 3, 6, 5, 7, 4};
        int[] arr2 = new int[]{1,3,4,2,8,6};
        int[] arr3 = new int[]{1,3,2,3};
        System.out.println(s.isPostArray(arr));
        System.out.println(s.isPostArray(arr2));
        System.out.println(s.isPostArray(arr3));
    }
}
