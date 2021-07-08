package Section8_数组和矩阵问题.第48题_旋转图像;

public class Solution {
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

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        s.rotate(matrix);
    }
}
