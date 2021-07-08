package Section8_数组和矩阵问题.第46题_全排序;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> reslist = new ArrayList<>();
        boolean[] bools = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        part_permute(reslist, bools, list, nums);
        return reslist;
    }

    public void part_permute(List<List<Integer>> lists, boolean[] bools, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            List<Integer> tmplist = new ArrayList<>(list);
            lists.add(tmplist);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!bools[i]) {
                bools[i] = true;
                list.add(nums[i]);
                part_permute(lists, bools, list, nums);
                list.remove(list.size() - 1);
                bools[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> lists = s.permute(nums);
        for (List<Integer> tmp : lists) {
            for (int tmptmp : tmp) {
                System.out.print(tmptmp + " ");
            }
            System.out.println();
        }
    }

}