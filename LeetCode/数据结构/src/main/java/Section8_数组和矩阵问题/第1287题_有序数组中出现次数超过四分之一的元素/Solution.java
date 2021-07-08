package Section8_数组和矩阵问题.第1287题_有序数组中出现次数超过四分之一的元素;

import java.util.HashMap;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        if (arr == null) {
            return -1;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.get(arr[i]) != null) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        int res = Integer.MIN_VALUE;
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            if (res < hashMap.get(arr[i])) {
                res = hashMap.get(arr[i]);
                ret = arr[i];
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 6, 6, 6, 7, 10};
        int[] arr2 = new int[]{1,2};
        Solution s = new Solution();
        System.out.println(s.findSpecialInteger(arr));
        System.out.println(s.findSpecialInteger(arr2));
    }
}
