package Section4_递归和动态规划.A2_台阶问题的递归和动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine_Advanced {
    public static long[][] matrixcheng(long[][] m1, long[][] m2) {
        long[][] res = new long[m1.length][m2[0].length];
        long tmp = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                tmp = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    tmp += m1[i][k] * m2[k][j];
                }
                res[i][j] = tmp;
            }
        }
        return res;
    }

    public static long[][] matrixpower(long[][] m, long k) {
        long[][] matrix_power = new long[m.length][m.length];
        if (k == 0) {
            for (int i = 0; i < m.length; i++) {
                matrix_power[i][i] = 1;
            }
        }else if (k == 1) {
            matrix_power = m;
        }else {
            matrix_power = m;
            for (int i = 0; i < k - 1; i++) {
                matrix_power = matrixcheng(matrix_power, m);
            }
        }
        return matrix_power;
    }

    public static long climbStairs(long n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        long[][] helpmatrix = new long[][]{{1, 1}, {1, 0}};
        long[][] ans = matrixpower(helpmatrix, n - 1);
        return ans[0][0] + ans[1][0];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        String[] inputLine = str.split(" ");
        long m =  Long.parseLong(inputLine[0]);
        long ans = climbStairs(m) % 1000000007;
        System.out.println(ans);
    }
}

