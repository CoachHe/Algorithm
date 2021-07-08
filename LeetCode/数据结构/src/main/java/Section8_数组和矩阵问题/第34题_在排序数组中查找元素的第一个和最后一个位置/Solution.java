package Section8_数组和矩阵问题.第34题_在排序数组中查找元素的第一个和最后一个位置;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftindex = searchLeft(nums, target);
        int rightindex = searchRight(nums, target);
        int[] res = new int[]{leftindex, rightindex};
        return res;
    }

    public int searchLeft(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int index;
        while (left <= right) {
            index = (right + left) / 2;
            if (nums[index] < target) {
                left = index + 1;
            } else if (nums[index] > target) {
                right = index - 1;
            } else if (index == 0 && nums[index] == target) {
                return 0;
            } else if (nums[index] == target && nums[index - 1] != target) {
                return index;
            } else {
                right = index - 1;
            }
        }
        return -1;
    }

    public int searchRight(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int index;
        while (left <= right) {
            index = (right + left) / 2;
            if (nums[index] < target) {
                left = index + 1;
            } else if (nums[index] > target) {
                right = index - 1;
            } else if (index == nums.length - 1 && nums[index] == target) {
                return nums.length - 1;
            } else if (nums[index] == target && nums[index + 1] != target) {
                return index;
            } else {
                left = index + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{5,7,7,8,8,10};
        int[] nums2 = new int[]{5,7,7,8,8,10};
        s.searchLeft(nums, 8);
        s.searchRight(nums, 8);
        System.out.println(s.searchLeft(nums, 8));
        System.out.println(s.searchRight(nums, 8));
        System.out.println(s.searchLeft(nums, 6));
    }
}
