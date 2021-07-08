package Section8_数组和矩阵问题.第728题_两数之和;

public class Solution1 {

    public int monotoneIncreasingDigits(int N) {
        int res = N;
        while (res > 0 && !Digit_judge(res)) {
            res--;
        }
        return res;
    }

    public boolean Digit_judge(int N) {
        int tmp = Integer.MAX_VALUE;
        while (N > 0) {
            int par = N % 10;
            N /= 10;
            if (tmp >= par) {
                tmp = par;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.monotoneIncreasingDigits(1254));
    }
}
