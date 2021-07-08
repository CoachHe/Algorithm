package Section5_字符串问题.第5题_最长回文子串;

import java.util.HashMap;

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            for (int j = i; j < s.length(); j++) {
                if (tmp == s.charAt(j) && isPalindrome(s.substring(i, j + 1))) {
                    hashMap.put(s.substring(i, j + 1), s.substring(i, j + 1).length());
                }
            }
        }
        int k = Integer.MIN_VALUE;
        String fs = "";
        for (String key : hashMap.keySet()) {
            int i = hashMap.get(key);
            if (k < i) {
                k = i;
                fs = key;
            }
        }
        return fs;
    }

    public boolean isPalindrome(String sP) {
        for (int i = 0; i <= sP.length() / 2; i++) {
            if (sP.charAt(i) != sP.charAt(sP.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
        Solution solution = new Solution();
        String fs = solution.longestPalindrome(s);
        System.out.println(fs);
    }
}
