package 第3章_高质量的代码.第3节_代码的完整性.面试题19_正则表达式匹配;

public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        return partMatch(str, 0, pattern, 0);
    }

    public boolean partMatch(char[] str, int m, char[] pattern, int n) {
        if (m == str.length && n == pattern.length) {
            return true;
        }
        if (n == pattern.length) {
            return false;
        }
        if (m == str.length) {
            return check(pattern, n);
        }
        if (str[m] == pattern[n]) {
            return partMatch(str, m + 1, pattern, n + 1);
        } else if (pattern[n] == '.' && n == pattern.length - 1) {
            return partMatch(str, m + 1, pattern, n + 2);
        } else if (pattern[n] == '.' && pattern[n + 1] == '*') {
            return partMatch(str, m + 1, pattern, n + 2);
        } else if (pattern[n] == '.' && pattern[n + 1] != '*') {
            return partMatch(str, m + 1, pattern, n + 1);
        } else {
            char tmp = pattern[n];
            int index = n;
            while (pattern[n] != '*') {
                n++;
            }
            if (tmp != str[m]) {
                return partMatch(str, m, pattern, n + 1);
            } else {
                return partMatch(str, m + 1, pattern, n + 1) ||
                        partMatch(str, m + 1, pattern, index);
            }

        }
    }

    public boolean check(char[] pattern, int index) {
        for (int i = index; i < pattern.length; i++) {
            if ((i - index) % 2 == 1) {
                if (pattern[i] != '*') {
                    return false;
                }
            }
        }
        if ((pattern.length - index) % 2 == 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.match("aaa".toCharArray(),
                "ab*ac*a".toCharArray()));
        System.out.println(s.match("".toCharArray(),
                "".toCharArray()));
        System.out.println(s.match("aa".toCharArray(),
                "aa*".toCharArray()));
    }
}