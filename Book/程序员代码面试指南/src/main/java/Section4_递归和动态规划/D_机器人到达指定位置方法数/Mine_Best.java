package Section4_递归和动态规划.D_机器人到达指定位置方法数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine_Best {
    public static int walkBest(int N, int cur, int rest, int P) {
        if (cur <= 0 || cur > N || rest < 0 || N < P) {
            return 0;
        }
        int[] res = new int[N];
        res[P - 1] = 1;
        int tmp1 = 0;
        int tmp2 = 0;
        for (int j = 1; j < rest + 1; j++) {
            for (int i = 0; i < N; i++) {
                tmp2 = tmp1;
                tmp1 = res[i];
                if (i == 0) {
                    res[i] = res[i + 1];
                } else if (i == N - 1) {
                    res[i] = tmp2;
                } else {
                    res[i] = tmp2 + res[i + 1];
                }
                res[i] %= 1000000007;
            }
        }
        return res[cur-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" " );
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        int k = Integer.parseInt(strs[2]);
        int p = Integer.parseInt(strs[3]);
        System.out.println(walkBest(n, m, k, p));
    }
}
