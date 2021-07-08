package 第2章_面试需要的基础知识.第4节_算法和数据操作.C_回溯法.面试题13_机器人的运动范围;

public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[] judgeMatrix = new boolean[rows * cols];

        return parNum(threshold, rows, cols, 0, 0, judgeMatrix);
    }

    public int parNum(int threshold, int rows, int cols, int row,
                          int col, boolean[] judgeMatrix) {
        if (row < 0 || row >= rows || col < 0 || col >= cols
                ||judgeMatrix[row * cols + col] ||
                !BigOrSmall(row, col, threshold)) {
            return 0;
        }
        judgeMatrix[row * cols + col] = true;
        return 1 +  parNum(threshold, rows, cols, row + 1, col, judgeMatrix) +
                        parNum(threshold, rows, cols, row, col + 1, judgeMatrix) +
                        parNum(threshold, rows, cols, row - 1, col, judgeMatrix) +
                        parNum(threshold, rows, cols, row, col - 1, judgeMatrix);
    }


    public boolean BigOrSmall(int row, int col, int threshold) {
        int sum = 0;
        while (row != 0) {
            sum += row % 10;
            row = row / 10;
        }
        while (col != 0) {
            sum += col % 10;
            col = col / 10;
        }
        if (sum > threshold) return false;
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.movingCount(15,20,20));
    }
}