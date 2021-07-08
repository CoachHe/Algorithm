package Section8_数组和矩阵问题.第73题_矩阵置零;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public void setColors(int[][] matrix) {
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new Integer[]{i, j});
                }
            }
        }
        for (Integer[] integers : list) {
            setOneZero(matrix, integers[0], -1);
        }
        for (Integer[] integers : list) {
            setOneZero(matrix, -1, integers[1]);
        }

    }

    public void setOneZero(int[][] matrix, int row, int col) {
        if (row == -1){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        } else {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        s.setColors(matrix);
        for (int[] tmp : matrix) {
            for (int tmp2 : tmp) {
                System.out.print(tmp2 + " ");
            }
            System.out.println();
        }
    }
}