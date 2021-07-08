package Section8_数组和矩阵问题.第15题_三数之和;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> list;
        List<Integer> hel = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list = twoSum(nums, -nums[i]);
            System.out.println(list + " + " + nums[i]);
            if (list.size() != 0) {
                for (int j = 0; j < list.size(); j++) {
                    hel.add(list.get(j).get(0));
                    hel.add(list.get(j).get(1));
                    hel.add(nums[i]);
                    res.add(hel);
                    hel = new ArrayList<>();
                }
            }
        }
        return res;
    }

    public List<List<Integer>> twoSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> hel = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (hel.contains(target - nums[i])) {
                list.add(nums[i]);
                list.add(target - nums[i]);
                res.add(list);
                list = new ArrayList<>();
            } else if (!hel.contains(nums[i])) {
                hel.add(nums[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{-1, 0, 1, 2, -1, 4};
        System.out.println(s.threeSum(nums));
        System.out.println(s.twoSum(nums, 0));
    }
}


