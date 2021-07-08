package Section5_字符串问题.第290题_单词规律;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        char[] chars = pattern.toCharArray();
        if (strings.length != chars.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.get(chars[i]) == null) {
                map.put(chars[i], strings[i]);
            } else if (!map.get(chars[i]).equals(strings[i])) {
                return false;
            }
        }
        Map<String, Integer> res = new HashMap<>();
        for (Character key : map.keySet()) {
            if (res.get(map.get(key)) == null) {
                res.put(map.get(key), 1);
            } else if (res.get(map.get(key)) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.wordPattern("abba", "dog dog dog dog"));
    }
}
