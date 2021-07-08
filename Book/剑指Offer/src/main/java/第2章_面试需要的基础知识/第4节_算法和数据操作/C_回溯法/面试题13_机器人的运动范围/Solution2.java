package 第2章_面试需要的基础知识.第4节_算法和数据操作.C_回溯法.面试题13_机器人的运动范围;

public class Solution2 {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[] visited = new boolean[rows * cols];
        return movingCountCore(threshold, rows, cols, 0, 0, visited);
    }

    private int movingCountCore(int threshold, int rows, int cols,
                                int row, int col, boolean[] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) return 0;
        int i = row * cols + col;
        if (visited[i] || !checkSum(threshold, row, col)) return 0;
        visited[i] = true;
        return 1 + movingCountCore(threshold, rows, cols, row, col + 1, visited)
                + movingCountCore(threshold, rows, cols, row, col - 1, visited)
                + movingCountCore(threshold, rows, cols, row + 1, col, visited)
                + movingCountCore(threshold, rows, cols, row - 1, col, visited);
    }

    private boolean checkSum(int threshold, int row, int col) {
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
        Solution2 s = new Solution2();
        System.out.println(s.movingCount(1, 2, 2));
    }
}