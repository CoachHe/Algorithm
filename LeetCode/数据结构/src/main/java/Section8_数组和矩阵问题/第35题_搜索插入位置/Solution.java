package Section8_数组和矩阵问题.第35题_搜索插入位置;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int k = 0;
        while(k < nums.length && target > nums[k]){
            k++;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        Solution s = new Solution();
        System.out.println(s.searchInsert(nums,5));
        System.out.println(s.searchInsert(nums,2));
        System.out.println(s.searchInsert(nums,7));
        System.out.println(s.searchInsert(nums,0));
    }
}
