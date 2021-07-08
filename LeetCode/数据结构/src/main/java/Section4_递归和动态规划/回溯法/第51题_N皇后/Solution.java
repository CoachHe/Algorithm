package Section4_递归和动态规划.回溯法.第51题_N皇后;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<String>> paths = new LinkedList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean[][] judge = new boolean[n][n];
        mid_path(n, judge, 0, 0, 0);
        return paths;
    }

    public void mid_path(int n, boolean[][] judge, int x, int y, int index) {
        if (x < 0 || y < 0 || x >= n || y >= n || judge_one(judge, x, y)) {
            return;
        }
        if (index == n) {
            List<String> path = new LinkedList<>();
            tmp_add(judge, path, x, y);
            paths.add(new LinkedList<>(path));
        }
        for (int i = x; i < n; i++) {
            for (int j = y; j < n; j++) {
                judge[i][j] = true;
                mid_path(n, judge, i + 1, j, index + 1);
                mid_path(n, judge, i - 1, j, index + 1);
                mid_path(n, judge, i, j + 1, index + 1);
                mid_path(n, judge, i, j - 1, index + 1);
                judge[i][j] = false;
            }
        }
    }

    public void tmp_add(boolean[][] judge, List<String> path, int x, int y) {
        for (int i = 0; i < judge.length; i++) {
            for (int j = 0; j < judge.length; j++) {
                if (judge[x][y]) {
                    path.add("Q");
                } else {
                    path.add(".");
                }
            }
        }
    }

    public boolean judge_one(boolean[][] judge, int x, int y) {
        if (x == 0 && y == 0) {
            return judge[x][y + 1] || judge[x + 1][y] || judge[x][y];
        }
        if (x == 0 && y < judge.length - 1) {
            return judge[x][y + 1] || judge[x][y - 1] || !judge[x + 1][y] || judge[x][y];
        }
        if (x == 0 && y == judge.length - 1) {
            return judge[x][y - 1] || judge[x + 1][y] || judge[x][y];
        }
        if (y == 0 && x < judge.length - 1) {
            return judge[x + 1][y] || judge[x - 1][y] || judge[x][y + 1] || judge[x][y];
        }
        if (y == 0 && x == judge.length - 1) {
            return judge[x - 1][y] || judge[x][y + 1] || judge[x][y];
        }
        if (x == judge.length - 1 && y < judge.length - 1) {
            return judge[x - 1][y] || judge[x][y - 1] || judge[x][y + 1] || judge[x][y];
        }
        if (x == judge.length - 1 && y == judge.length - 1) {
            return judge[x - 1][y] || judge[x][y - 1] || judge[x][y];
        }
        if (y == judge.length - 1 && x < judge.length - 1) {
            return judge[x - 1][y] || judge[x + 1][y] || judge[x][y - 1] || judge[x][y];
        }
        return judge[x - 1][y] || judge[x + 1][y] || judge[x][y - 1] || judge[x][y + 1] || judge[x][y] ;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solveNQueens(4));

    }
}
