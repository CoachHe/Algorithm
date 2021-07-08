package Section4_递归和动态规划.第509题_斐波那契数;

public class Solution_Recursive {
    public int fib(int N) {
        if (N == 1 || N == 0) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        Solution_Recursive s = new Solution_Recursive();
        System.out.println(s.fib(4));
    }
}
