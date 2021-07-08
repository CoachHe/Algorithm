package 第2章_面试需要的基础知识.第3节_数据结构.B_字符串.面试题5_替换空格;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                res += "%20";
            }else {
                res += chars[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        StringBuffer str = new StringBuffer("We are happy");
        System.out.println(s.replaceSpace(str));
    }
}
