package Section8_数组和矩阵问题.第48题_旋转图像;

public class Solution2 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix.length - i - 1; j++) {
                change(matrix, i, j);
            }
        }
    }

    public void change(int[][] arr, int i, int j) {
        int len = arr.length;
        int t_l_i = i;
        int t_l_j = j;
        int t_r_i = j;
        int t_r_j = len - i - 1;
        int d_l_i = len - j - 1;
        int d_l_j = i;
        int d_r_i = len - i - 1;
        int d_r_j = len - j - 1;
        swag(arr, t_l_i, t_l_j, t_r_i, t_r_j);
        swag(arr, t_l_i, t_l_j, d_r_i, d_r_j);
        swag(arr, t_l_i, t_l_j, d_l_i, d_l_j);
    }

    public void swag(int[][] arr, int i, int j, int newi, int newj) {
        int tmp = arr[i][j];
        arr[i][j] = arr[newi][newj];
        arr[newi][newj] = tmp;
    }

    public static void main(String[] args) {
//        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Solution2 s = new Solution2();
        s.rotate(arr);
        for (int[] tmp : arr) {
            for (int tmp2 : tmp) {
                System.out.print(tmp2 + " ");
            }
            System.out.println();
        }
    }
}
