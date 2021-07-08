package Section5_字符串问题.第344题_反转字符串;

public class Solution {
    public void reverseString(char[] s) {
        char tmp = ' ';
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String string = "hello";
        char[] chars = string.toCharArray();
        s.reverseString(chars);
    }
}
