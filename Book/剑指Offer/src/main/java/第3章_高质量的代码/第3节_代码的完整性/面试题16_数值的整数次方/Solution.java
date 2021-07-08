package 第3章_高质量的代码.第3节_代码的完整性.面试题16_数值的整数次方;

public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0 && exponent != 0) {
            return 0;
        } else if (base != 0 && exponent == 0) {
            return 1;
        } else if (base == 0 && exponent == 0) {
            return 0;
        }
        double res = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                res *= base;
            }
        } else if (exponent < 0) {
            int ex = Math.abs(exponent);
            for (int i = 0; i < ex; i++) {
                res *= base;
            }
            res = 1 / res;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.Power(2,-2));
    }
}