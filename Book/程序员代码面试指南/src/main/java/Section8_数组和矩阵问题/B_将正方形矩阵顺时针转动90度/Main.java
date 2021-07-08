package Section8_数组和矩阵问题.B_将正方形矩阵顺时针转动90度;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void rotate(int[][] matrix) {
        for (int k = 0; k < matrix.length / 2; k++) {
            ratateOne(matrix, k);
        }
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void ratateOne(int[][] matrix, int k) {
        int lu_r = k, lu_c = k, ru_r = lu_r, ru_c = matrix.length - 1 - k;
        int ld_r = matrix.length - 1 - k, ld_c = lu_r, rd_r = ld_r, rd_c = ru_c;
        int tmp;
        for (int i = 0; i < matrix.length - 2 * k - 1; i++) {
            tmp = matrix[lu_r][lu_c + i];
            matrix[lu_r][lu_c + i] = matrix[ld_r - i][ld_c];
            matrix[ld_r - i][ld_c] = matrix[ld_r][rd_c - i];
            matrix[ld_r][rd_c - i] = matrix[ru_r + i][rd_c];
            matrix[ru_r + i][rd_c] = tmp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(strings[j]);
            }
        }
        Main m = new Main();
        m.rotate(arr);
    }
}
