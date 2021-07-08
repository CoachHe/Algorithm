package Section8_数组和矩阵问题.第26题_删除排序数组中的重复项;

import java.util.HashMap;

public class Solution_1 {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsValue(nums[i])) {
                hashMap.put(k++, nums[i]);
            }
        }
        int[] newnums = new int[hashMap.size()];
        for (int i = 0; i < hashMap.size(); i++) {
            newnums[i] = hashMap.get(i);
        }
        for (int i = 0; i < newnums.length; i++) {
            nums[i] = newnums[i];
        }
        return k;
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

