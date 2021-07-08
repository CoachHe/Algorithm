package 第2章_面试需要的基础知识.第4节_算法和数据操作.C_回溯法.面试题12_矩阵中的路径;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mine {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        boolean[] helpMatrix = new boolean[rows * cols];
        char[][] doubleMatrix = toDoubleChar(matrix, rows, cols);
        List<Integer> list = num(matrix, str[0]);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (partJudge(doubleMatrix, list.get(i) / cols,
                    Math.floorMod(list.get(i), cols), cols, str, helpMatrix, index)) {
                return true;
            }
            Arrays.fill(helpMatrix, false);
        }

        return false;
    }


    public boolean partJudge(char[][] matrix, int row, int col, int cols,
                             char[] str, boolean[] helpMatrix, int index) {
        boolean res = false;
        if (row < 0 || col < 0 || row > matrix.length - 1 || col >
                matrix[0].length - 1 || matrix[row][col] != str[index]
                || helpMatrix[row * cols + col]) {
            return false;
        } else if (index + 1 == str.length) {
            return true;
        } else {
            helpMatrix[row * cols + col] = true;
            res =  partJudge(matrix, row + 1, col, cols, str, helpMatrix, index + 1)||
                    partJudge(matrix, row, col + 1, cols, str, helpMatrix, index + 1)||
                    partJudge(matrix, row - 1, col, cols, str, helpMatrix, index + 1)||
                    partJudge(matrix, row, col - 1, cols, str, helpMatrix, index + 1);
            if (!res){
                helpMatrix[row * cols + col] = false;
            }
        }
        return res;
    }


    public char[][] toDoubleChar(char[] matrix, int rows, int cols) {
        char[][] res = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = matrix[i * cols + j];
            }
        }
        return res;
    }

    public List<Integer> num(char[] chars, char C) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == C) {
                list.add(i);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Mine mine = new Mine();
        char[] charss = "ABSF".toCharArray();
        System.out.println(mine.hasPath(charss, 2, 2, "ABFS".toCharArray()));
    }

}
