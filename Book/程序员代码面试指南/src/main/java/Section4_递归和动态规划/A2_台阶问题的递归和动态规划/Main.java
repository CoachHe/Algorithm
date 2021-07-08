package Section4_递归和动态规划.A2_台阶问题的递归和动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static long[][] matrixMul(long[][] m1, long[][] m2){
        long[][] res = new long[m1.length][m2[0].length];
        for(int i = 0; i < m1.length; ++i){
            for(int j = 0; j < m2[0].length; ++j){
                for(int k = 0; k < m2.length; ++k){
                    res[i][j] += m1[i][k] * m2[k][j];
                    res[i][j] %= 1000000007;
                }
            }
        }
        return res;
    }

    public static long[][] matrixPower(long[][] m, long p){
        long[][] res = new long[m.length][m[0].length];
        for(int i = 0; i < m.length; ++i){
            res[i][i] = 1;
        }
        long[][] tmp = m;
        while(p != 0){
            if((p & 1) != 0){
                res = matrixMul(res, tmp);
            }
            tmp = matrixMul(tmp, tmp);
            p >>= 1;
        }
        return res;
    }

    public static long fib(long n){
        if(n < 1)
            return 0;
        if(n == 1 || n == 2)
            return n;
        long[][] base = {{1,1}, {1, 0}};
        long[][] res = matrixPower(base, n-2);
        return (2 * res[0][0] + res[1][0]) % 1000000007;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = in.readLine().split(" ");
        long n = Long.parseLong(str1[0]);
        System.out.println(fib(n));
    }
}