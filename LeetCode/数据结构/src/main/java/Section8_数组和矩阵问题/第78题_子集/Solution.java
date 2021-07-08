package Section8_数组和矩阵问题.第78题_子集;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> reslists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        reslists.add(list);
        boolean[] booleans = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sublist(nums, reslists, list, i + 1, i, booleans);
            booleans = new boolean[nums.length];
        }
        return reslists;
    }

    public void sublist(int[] nums, List<List<Integer>> treslists, List<Integer> tlist, int index, int j, boolean[] booleans) {
        if (tlist.size() == index) {
            List<Integer> list = new ArrayList<>(tlist);
            treslists.add(list);
            return;
        }
            for (int i = j; i < nums.length; i++) {
                if (booleans[i]) {
                    continue;
                }
                booleans[i] = true;
                tlist.add(nums[i]);
                sublist(nums, treslists, tlist, index, j, booleans);
                booleans[i] = false;
                tlist.remove(tlist.size() - 1);
            }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        for (List<Integer> tmplist : s.subsets(nums)) {
            for (int tmp : tmplist) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }

}
