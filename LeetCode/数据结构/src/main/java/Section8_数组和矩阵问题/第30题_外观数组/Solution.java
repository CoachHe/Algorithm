package Section8_数组和矩阵问题.第30题_外观数组;

public class Solution {
    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        if (n == 1) {
            return str.toString();
        }
        for (int i = 2; i <= n; i++) {
            char[] chars = str.toString().toCharArray();
            str = new StringBuilder("");
            int tmp = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars.length == 1) {
                    str = new StringBuilder("11");
                    break;
                }
                if (j == chars.length - 1 && chars[j] == chars[j - 1]) {
                    str.append(tmp + 1);
                    str.append(chars[j]);
                    break;
                } else if (j == chars.length - 1) {
                    str.append(1);
                    str.append(chars[j]);
                    break;
                }
                if (chars[j] != chars[j + 1]) {
                    str.append(tmp + 1);
                    str.append(chars[j]);
                    tmp = 0;
                } else {
                    tmp++;
                }
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countAndSay(5));
    }
}
