package 第3章_高质量的代码.第3节_代码的完整性.面试题20_表示数值的字符串;

public class Solution {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0 || (str.length == 1
                && (str[0] < '0' || str[0] > '9'))) {
            return false;
        }

        int eIndex = 0;
        for (int i = (str[0] == '-' || str[0] == '+') ? 1 : 0;
             i < str.length; i++) {
            if (str[i] == 'E' || str[i] == 'e') {
                if (i == str.length - 1) {
                    return false;
                } else if (str[i - 1] == '.' || str[i] + 1 == '.') {
                    return false;
                } else if ((str[i] == '-' || str[i] == '+')
                        && i == str.length - 2) {
                    return false;
                } else {
                    eIndex++;
                }
            }
        }
        if (eIndex > 1) {
            return false;
        }


        int dotIndex = 0;
        for (int i = (str[0] == '-' || str[0] == '+') ? 1 : 0;
             i < str.length; i++) {
            if (str[i] == '.') {
                dotIndex++;
            } else if (str[i] == 'E' || str[i] == 'e') {
                i++;
                int tmpIndex = 0;
                for (int j = i; j < str.length; j++) {
                    if (str[j] == '.') {
                        tmpIndex++;
                    }
                }
                if (tmpIndex > 0) {
                    return false;
                }
            } else if (str[i] < '0' || str[i] > '9') {
                return false;
            }
            if (dotIndex > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isNumeric("-.123".toCharArray()));
    }
}