package Section9_其他题目.O15_调整0到x区间上数出现的概率;

public class Solution {
    public double randPower2() {
        return Math.max(Math.random(), Math.random());
    }

    public double randXPower(int k) {
        if (k < 1) {
            return 0;
        }
        double res = -1;
        for (int i = 0; i != k; i++) {
            res = Math.max(res, Math.random());
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.randXPower(5));
    }

}
