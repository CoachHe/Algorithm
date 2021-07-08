package Section5_字符串问题.第387题_字符串中的第一个唯一字符;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            map.merge(aChar, 1, Integer::sum);
        }
        int tmp = 0;
        for (char aChar : chars) {
            if (map.get(aChar) == 1) {
                return tmp;
            }
            tmp++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.firstUniqChar("leetcode"));
        System.out.println(s.firstUniqChar("loveleetcode"));
    }

}
