package Section9_其他.第50题_幂次;

public class Solution2 {
    public double myPow(double x, int n) {
        double res = 1;
        double tmppow = x;
        if (n >= 0) {
            while (n != 0) {
                if ((n & 1) == 1) {
                    res *= tmppow;
                }
                tmppow *= (tmppow);
                n >>= 1;
            }
            return res;
        }
        int tmpn = -n;
        tmppow = 1 / x;
        while (tmpn != 0) {
            if ((tmpn & 1) == 1) {
                res *= tmppow;
            }
            tmppow *= (tmppow);
            tmpn >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.myPow(2,10));
        System.out.println(s.myPow(2, -2));
    }
}
