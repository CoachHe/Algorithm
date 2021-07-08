package Section8_数组和矩阵问题.第26题_删除排序数组中的重复项;

import java.util.HashMap;

public class Solution_2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Solution_1 s = new Solution_1();
        System.out.println(s.removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

