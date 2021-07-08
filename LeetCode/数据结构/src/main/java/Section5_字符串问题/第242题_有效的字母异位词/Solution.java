package Section5_字符串问题.第242题_有效的字母异位词;

public class Solution {
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < chars1.length; i++) {
            map[chars1[i]]++;
        }
        for (int i = 0; i < chars2.length; i++) {
            map[chars2[i]]--;
            if (map[chars2[i]] < 0) {
                return false;
            }
        }
        return true;
    }
}
