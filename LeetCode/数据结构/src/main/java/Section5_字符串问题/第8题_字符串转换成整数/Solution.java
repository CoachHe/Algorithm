package Section5_字符串问题.第8题_字符串转换成整数;

public class Solution {
    public int begin(char[] chars) {
        if (chars == null || chars.length == 0) {
            return -1;
        }
        if (chars.length == 1 && chars[0] == '-') {
            return -1;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '+' && chars[i] != '-' && chars[i] != ' ' && (chars[i] < '0' || chars[i] > '9')) {
                return -1;
            } else if (chars[i] != '+' && chars[i] == '-' && chars[i + 1] >= '0' && chars[i + 1] <= '9') {
                return i;
            }
            if (chars[i] != '+' && chars[i] > '0' && chars[i] <= '9') {
                return i;
            }
        }
        return -1;
    }
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int judge = begin(chars);
        if (judge == -1) {
            return 0;
        }
        boolean posi = chars[judge] == '-' ? false : true;
        int ming = Integer.MIN_VALUE / 10;
        int minr = Integer.MIN_VALUE % 10;
        int cur = 0;
        int res = 0;
        for (int i = posi ? judge : judge+1; i < chars.length; i++) {
            cur = '0' - chars[i];
            if (res < ming) {
                return Integer.MIN_VALUE;
            }
            if (res == ming && cur < minr) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + cur;
            if (i < chars.length-1 && (chars[i + 1] < '0' || chars[i + 1] > '9')) {
                return posi ? -res : res;
            }
        }
        return posi ? -res : res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int i = s.myAtoi("-91283472332");
        System.out.println(s.myAtoi("+-2"));
    }
}
