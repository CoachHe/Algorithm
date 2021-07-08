package Section8_数组和矩阵问题.C_之字形打印矩阵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void printZ(int[][] matrix) {
        int height = matrix.length;
        int weigh = matrix[0].length;
        int tmp_h_r, tmp_h_c;
        int tmp_d_r, tmp_d_c;
        boolean b = false;
        for (int i = 0; i < height + weigh; i++) {
            tmp_h_r = i > weigh ? i - weigh + 1 : 0;
            tmp_h_c = i >= weigh ? weigh - 1 : i;
            tmp_d_r = i < height ? i : height - 1;
            tmp_d_c = i >= height ? i - height + 1 : 0;
            for (int j = 0; j <= tmp_h_c - tmp_d_c ; j++) {
                if (!b) {
                    System.out.print(matrix[tmp_d_r - j][tmp_d_c + j] + " ");
                } else {
                    System.out.print(matrix[tmp_h_r + j][tmp_h_c - j] + " ");
                }
            }
            b = !b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            strings = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(strings[j]);
            }
        }
        Main s = new Main();
        s.printZ(matrix);
    }
}
