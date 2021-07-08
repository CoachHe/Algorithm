package Section8_数组和矩阵问题.第1题_两数之和;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i]) && hashMap.get(target - nums[i]) != i) {
                res = new int[]{Math.min(hashMap.get(target - nums[i]), i),Math.max(hashMap.get(target - nums[i]), i)};
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{3,3};
        int[] res = s.twoSum(nums, 6);
        int[] nums2 = new int[]{1,2,3,4,5};
        int[] res2 = s.twoSum(nums2, 5);
        for (int tmp : res) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        for (int tmp2 : res2) {
            System.out.print(tmp2 + " ");
        }
        System.out.println("Hello World");
        for (int i = 0; i < 5; i ++){

        }
        for (int i = 0; i < 5; i++) {

        }

    }
}
