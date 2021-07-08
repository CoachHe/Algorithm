package Section8_数组和矩阵问题.第10题_正则表达式匹配;

public class Solution {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null || s.length() == 0 || p.length() == 0) {
            return false;
        }
        return partMatch(s, p, 0, 0);
    }

    public boolean partMatch(String s, String p, int s_begin, int p_begin) {
        if (p_begin == p.length() && s_begin == s.length()) {
            return true;
        }
        if (p_begin == p.length()) {
            return false;
        }
        if (s_begin == s.length()) {
            if (p_begin <= p.length() - 2 && p.charAt(p_begin + 1) == '*') {
                return star_deal(s, p, s_begin, p_begin);
            } else {
                return false;
            }
        }
        boolean first_judge = s.charAt(s_begin) == p.charAt(p_begin) || p.charAt(p_begin) == '.';
        if (p_begin == p.length() - 1) {
            return first_judge && s_begin == s.length() - 1;
        }
        if (p_begin != p.length() - 1 && p.charAt(p_begin + 1) != '*') {
            if (first_judge) {
                return partMatch(s, p, s_begin + 1, p_begin + 1);
            } else {
                return false;
            }
        }
        return star_deal(s, p, s_begin, p_begin);
    }

    public boolean star_deal(String s, String p, int s_begin, int p_begin) {
        if (p.charAt(p_begin) == '.') {
            return p_begin == p.length() - 2;
        }
        for (int i = s_begin; i < s.length(); i++) {
            if (s.charAt(i) != p.charAt(p_begin)) {
                return partMatch(s, p, i, p_begin + 2);
            }
        }
        return partMatch(s, p, s.length(), p_begin + 2);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isMatch("aa", "a"));
        System.out.println(s.isMatch("aa", "a*"));
        System.out.println(s.isMatch("aab", "c*a*b"));
        System.out.println(s.isMatch("mississippi", "mis*is*p*."));
        System.out.println(s.isMatch("abcd","d*"));
        System.out.println(s.isMatch("ab", ".*"));
        System.out.println(s.isMatch("aaa","aaaa"));
        System.out.println(s.isMatch("a", "ab*"));
        System.out.println(s.isMatch("a","ab*a"));
    }


}
