package Section8_数组和矩阵问题.第912题_排序数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> sorArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{5, 1, 1, 2, 0, 0};
        List<Integer> list = s.sorArray(nums);
        System.out.println(list);
    }
}
