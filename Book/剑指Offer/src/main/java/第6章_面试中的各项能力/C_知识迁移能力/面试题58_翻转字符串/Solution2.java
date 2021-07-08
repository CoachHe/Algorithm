package 第6章_面试中的各项能力.C_知识迁移能力.面试题58_翻转字符串;

public class Solution2 {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() < 1) {
            return str;
        }
        char[] chars = str.toCharArray();
        String res = "";
        for (int i = n; i < str.length(); i++) {
            res += chars[i];
        }
        for (int i = 0; i < n; i++) {
            res += chars[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.LeftRotateString("abcdefg", 2));
    }
}
