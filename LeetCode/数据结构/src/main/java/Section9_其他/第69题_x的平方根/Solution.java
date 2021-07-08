package Section9_其他.第69题_x的平方根;

class Solution {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        for (int i = 0; i < x; i++) {
            if (Math.pow(i, 2) <= x && Math.pow(i + 1, 2) > x) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(2147395600));
    }
}