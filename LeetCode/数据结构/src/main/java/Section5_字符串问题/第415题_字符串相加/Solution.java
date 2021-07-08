package Section5_字符串问题.第415题_字符串相加;


public class Solution {
    public String addStrings(String num1, String num2) {
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int a = Math.min(chars1.length, chars2.length);
        int jinwei = 0;
        char[] res = new char[((chars1.length == chars2.length) &&
                (chars1[chars1.length - 1] - '0' + chars2[chars1.length - 1] - '0' > '9' - '0')) ?
                chars1.length + 1 : Math.max(chars1.length, chars2.length)];
        String re = null;
        int tmp = 0;
        int k = 0;
        for (int i = res.length - 1; i >= 0 ; i--) {
            if (i >= res.length - a) {
                tmp = chars1[chars1.length - 1 - k] - '0' + chars2[chars2.length - 1 - k] - '0' + jinwei;
                res[i] = (char) (tmp > '9' - '0' ? tmp - ('9' - '0') - 1 : tmp);
                jinwei = tmp > '9' - '0' ? 1 : 0;
            } else if (i >= 1) {
                tmp = chars1.length >= chars2.length ? chars1[chars1.length - 1 - k] - '0' + jinwei :
                        chars2[chars2.length - 1 - k] - '0' + jinwei;
                res[i] = (char) (tmp > '9' - '0' ? tmp - ('9' - '0') - 1 : tmp);
                jinwei = tmp > '9' - '0' ? 1 : 0;
            } else {
                res[0] = 1;
            }
            k++;
        }
        for (int i = 0; i < res.length; i++) {
                re += (int) res[i];
        }
        return re.substring(4, re.length());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.addStrings("99", "9"));
    }
}
