package Section9_其他题目.V22_判断一个数是否是回文数;

public class Solution {
    public static boolean isPalindrome(int n) {
        if (n == 0) {
            return true;
        }
        n = Math.abs(n);
        int tmp = n % 10;
        int k = 1;
        while (n > 0) {
            while (tmp <= n / 10) {
                tmp *= 10;
                k *= 10;
            }
            if (n - tmp > k || n - tmp < 0) {
                return false;
            } else  {
                n = (n - tmp) / 10;
                tmp = n % 10;
                k = 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-123321));
    }
}
