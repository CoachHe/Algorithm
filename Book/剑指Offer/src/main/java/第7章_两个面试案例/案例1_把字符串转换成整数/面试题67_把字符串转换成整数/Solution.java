package 第7章_两个面试案例.案例1_把字符串转换成整数.面试题67_把字符串转换成整数;

public class Solution {
    public int StrToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        char c0 = chars[0];
        if ((c0 != '+') && (c0 != '-') && ((c0 - '0'> 9) || (c0 - '0' < 0))) {
            return 0;
        }
        for (int i = 1; i < chars.length; i++) {
            if ((chars[i] - '0' > 9) || (chars[i] - '0' < 0)) {
                return 0;
            }
        }
        int index = 1;
        int res = 0;
        for (int i = chars.length - 1; i >= (((c0 == '+') || (c0 =='-')) ? 1 : 0);
             i--) {
            res += index * (chars[i] - '0');
            index *= 10;
            if (res < 0 && res != Integer.MIN_VALUE) {
                return 0;
            } else if (res == Integer.MIN_VALUE && c0 != '-') {
                return 0;
            }
        }
        if (c0 == '-') {
            return -res;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.StrToInt("2147483648"));
    }
}