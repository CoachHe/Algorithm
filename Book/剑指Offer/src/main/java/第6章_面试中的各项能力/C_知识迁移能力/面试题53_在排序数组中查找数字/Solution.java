package 第6章_面试中的各项能力.C_知识迁移能力.面试题53_在排序数组中查找数字;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (array[mid] < k) {
                left = mid + 1;
            } else if (array[mid] > k) {
                right = mid - 1;
            } else if (mid == 0 || array[mid - 1] != k || right <= 0) {
                left = mid;
                break;
            } else {
                right = mid - 1;
            }
        }
        int left_index = left;
        if (left > right && left != 0) {
            return 0;
        }
        left = 0;
        right = array.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (array[mid] < k) {
                left = mid + 1;
            } else if (array[mid] > k) {
                right = mid - 1;
            } else if (array[mid + 1] != k || left >= array.length - 1) {
                right = mid;
                break;
            } else {
                left = mid + 1;
            }
        }
        if (left > right && right != array.length - 1) {
            return 0;
        }
        return right - left_index + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{3, 3, 3, 3, 4, 5};
        System.out.println(s.GetNumberOfK(arr, 3));
    }

}