package 第2章_面试需要的基础知识.第4节_算法和数据操作.D_动态规划与贪婪算法.面试题14_剪绳子;

// 用贪心算法解决
public class Solution2 {
    public int cutRope(int target) {
        if (target <= 1){
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int left = target;
        long res = 1L;
        int p = (int) 1e9+7;
        while (left >= 5) {
            res *= 3;
            res %= p;
            left -=3;
        }
        return (int) (left * res % p);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.cutRope(10));

    }
}
