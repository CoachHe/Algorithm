package Section4_递归和动态规划.A1_斐波那契数列问题的递归和动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    //给出一个整数 n，请输出斐波那契数列的第 n 项对 1e9 + 7 取模的值。
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        String[] inputLine = str.split(" ");
        long m =  Long.parseLong(inputLine[0]);
        System.out.println(fib(m));
    }
    public static long fib(long n) {
        if (n < 1) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        long[][] base = {{1, 1}, {1, 0}};
        long[][] res = matrixPower(base, n - 2);
        return (res[0][0] + res[1][0]) % 1000000007;
    }
 
    public static long[][] matrixPower(long[][] m, long p) {
        long[][] res = new long[m.length][m[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i][i] = 1;
        }
        long[][] tmp = m;
        while (p != 0) {
            if ((p & 1) != 0) {
                res = multMatrix(res, tmp);
            }
            tmp = multMatrix(tmp, tmp);
            p >>= 1;
        }
        return res;
    }
 
    private static long[][] multMatrix(long[][] m1, long[][] m2) {
        long[][] res = new long[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                    res[i][j] = res[i][j] % 1000000007;
                }
            }
        }
        return res;
    }
}