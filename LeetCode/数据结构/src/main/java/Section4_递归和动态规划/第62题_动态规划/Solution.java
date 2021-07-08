package Section4_递归和动态规划.第62题_动态规划;

class Solution {
    public int uniquePaths(int m, int n) {
        return tmpPath(0, 0, m - 1 , n - 1);
    }

    public int tmpPath(int tmp_m, int tmp_n, int m, int n) {
        if (tmp_m == m) {
            return 1;
        } else if (tmp_n == n) {
            return 1;
        }
        return tmpPath(tmp_m + 1, tmp_n, m, n) + tmpPath(tmp_m, tmp_n + 1, m, n);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.uniquePaths(51,9));
    }
}