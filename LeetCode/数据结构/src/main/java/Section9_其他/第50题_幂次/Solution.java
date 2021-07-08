package Section9_其他.第50题_幂次;

class Solution {
    public double myPow(double x, double n) {
        double res = 1;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                res *= x;
            }
            return res;
        }
        double tmpx = 1 / x;
        double tmpn = -n;
        for (double i = 0; i < tmpn; i++) {
            res *= tmpx;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.myPow(2, -2147483648);
        System.out.println(Double.MAX_VALUE);
        System.out.println(s.myPow(2.0000,10));
        System.out.println(s.myPow(2.1000,3));
        System.out.println(s.myPow(2.0000,-2));
        System.out.println(s.myPow(2.0000,-2147483648));
    }
}