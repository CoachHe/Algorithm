package 第2章_面试需要的基础知识.第4节_算法和数据操作.A_递归和循环.面试题10_斐波那契数列;

public class Solution_Mine {
    public int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int tmp = 1;
        int res = 1;
        int hi = 0;
        for (int i = 2; i < n; i++) {
            hi = res;
            res += tmp;
            tmp = hi;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution_Mine s = new Solution_Mine();
        System.out.println(s.Fibonacci(6));
    }
}
