package Section5_字符串问题.第125题_验证回文串;

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        if (s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left <= right) {
            if (!judgeNum(chars[left])) {
                left++;
            } else if (!judgeNum(chars[right])) {
                right--;
            } else {
                if (!equalWithoutSignal(chars[left], chars[right])) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean equalWithoutSignal(char a, char b) {
        if (a == b) {
            return true;
        }
        if (a >= 'a' && a <= 'z' && (a - ('a' - 'A')) == b) {
            return true;
        }
        return a >= 'A' && a <= 'Z' && (a + ('a' - 'A')) == b;
    }

    public boolean judgeNum(char a) {
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9')) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("v' 5:UxU:5 v'"));
    }
}