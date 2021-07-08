package Section4_递归和动态规划.第1137题_第N个斐波那契数;


public class Solution_Recursive {
    public int tribonacci(int n) {
        if (n <= 2) {
            return n == 2 ? 1 : n;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static void main(String[] args) {
        Solution_Recursive s = new Solution_Recursive();
        System.out.println(s.tribonacci(25));
    }
}
