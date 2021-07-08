package Section8_数组和矩阵问题.第704题_二分查找;

class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int res = -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left <= right){
            mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            } else if(nums[mid] > target){
                right = mid - 1;
            } else {
                res = mid;
                return res;
            }

        }
        String s = "abc";
        char[] chars = s.toCharArray();
        return res;
    }
}