package Section4_递归和动态规划.D_机器人到达指定位置方法数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine_Advanced {
    public static int walk(int N, int cur, int rest, int P) {
        if (cur <= 0 || cur > N || rest < 0 || N < P) {
            return 0;
        }
        int[][] dp = new int[N][rest + 1];
        for (int i = 0; i < N; i++) {
            if (i == P-1) {
                dp[i][0] = 1;
            }else {
                dp[i][0] = 0;
            }
        }
        for (int j = 1; j <= rest; j++) {
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else if (i == N-1) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i + 1][j - 1] + dp[i - 1][j - 1];
                }
                dp[i][j] %= 1000000007;
            }
        }
        return dp[cur - 1][rest];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" " );
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        int k = Integer.parseInt(strs[2]);
        int p = Integer.parseInt(strs[3]);
        System.out.println(walk(n, m, k, p));
    }
}
