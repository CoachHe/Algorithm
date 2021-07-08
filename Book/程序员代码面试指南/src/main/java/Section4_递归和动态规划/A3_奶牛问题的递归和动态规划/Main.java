package Section4_递归和动态规划.A3_奶牛问题的递归和动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
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
                res[i][j] %= 1000000007;
            }
        }
        return res;
    }

    public static long[][] matrixpower(long[][] m, long p){
        long[][] res = new long[m.length][m[0].length];
        for(int i = 0; i < m.length; ++i){
            res[i][i] = 1;
        }
        long[][] tmp = m;
        while(p != 0){
            if((p & 1) != 0){
                res = matrixcheng(res, tmp);
            }
            tmp = matrixcheng(tmp, tmp);
            p >>= 1;
        }
        return res;
    }

    public static long CowNumber(long N) {
        if (N <= 3) {
            return N;
        }
        long[][] m = new long[][]{{1, 1, 0}, {0, 0, 1}, {1, 0, 0}};
        long[][] res = matrixpower(m, N - 3);
        return (3 * res[0][0] + 2 * res[1][0] + res[2][0]) % 1000000007;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = in.readLine().split(" ");
        long n = Long.parseLong(str1[0]);
        System.out.println(CowNumber(n));
    }
}

