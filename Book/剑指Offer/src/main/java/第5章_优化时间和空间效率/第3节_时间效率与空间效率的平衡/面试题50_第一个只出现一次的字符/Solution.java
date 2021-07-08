package 第5章_优化时间和空间效率.第3节_时间效率与空间效率的平衡.面试题50_第一个只出现一次的字符;

import java.util.HashMap;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.get(chars[i]) == null) {
                hashMap.put(chars[i], 1);
            } else {
                hashMap.put(chars[i], hashMap.get(chars[i]) + 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.FirstNotRepeatingChar("google"));
    }
}