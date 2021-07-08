package 第2章_面试需要的基础知识.第4节_算法和数据操作.C_回溯法.面试题12_矩阵中的路径;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        char[][] chars = toDoubleChar(matrix, rows, cols);
        List<Integer> list = num(matrix, str[0]);
        char[] help;
        for (int i = 0; i < list.size(); i++) {
            help = new char[str.length];
            help[0] = str[0];
            if (Path(chars, list.get(i) / cols, Math.floorMod(list.get(i),cols), str, help, 0)) {
                return true;
            }
        }
        return false;
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

    public boolean Path(char[][] chars, int row, int col, char[] str, char[] help, int i) {
        if (row < 0 || col < 0 || row >= chars.length || col >= chars[0].length ||
                chars[row][col] != str[i] ) {
            return false;
        } else if (i == str.length - 1 && chars[row][col] != str[i]){
            return false;
        } else if (i == str.length - 1 && chars[row][col] == str[i]) {
            return true;
        } else {
            help[i] = str[i];
            i++;
            return Path(chars, row, col + 1, str, help, i) || Path(chars, row + 1, col, str, help, i)
                    || Path(chars, row - 1, col, str, help, i) || Path(chars, row, col - 1, str, help, i);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        char[] charss = "ABCESFCSADEE".toCharArray();
        System.out.println(s.hasPath(charss, 3, 4, "ABCB".toCharArray()));
    }

}