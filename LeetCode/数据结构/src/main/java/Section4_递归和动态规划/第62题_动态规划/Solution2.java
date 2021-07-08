package Section4_递归和动态规划.第62题_动态规划;

import java.util.Arrays;

public class Solution2 {
    public int uniquePaths(int m, int n) {
        if (m == 1) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        int[] top = new int[n];
        Arrays.fill(top, 1);
        int left = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j <n ; j++) {
                int tmppath = top[j] + left;
                left = tmppath;
                top[j] = left;
            }
            left = 1;
        }
        return top[top.length - 1];
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.uniquePaths(51, 9));
    }
}
