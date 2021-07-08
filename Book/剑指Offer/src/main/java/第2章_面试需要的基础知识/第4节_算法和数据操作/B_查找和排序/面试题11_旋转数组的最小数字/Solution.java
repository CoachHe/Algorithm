package 第2章_面试需要的基础知识.第4节_算法和数据操作.B_查找和排序.面试题11_旋转数组的最小数字;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (array[mid + 1] < array[mid]) {
                return array[mid + 1];
            }
            if (array[mid] < array[left]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return array[left];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = new int[]{9, 10, 10, 11, 7, 8, 9};
        System.out.println(s.minNumberInRotateArray(array));
    }
}