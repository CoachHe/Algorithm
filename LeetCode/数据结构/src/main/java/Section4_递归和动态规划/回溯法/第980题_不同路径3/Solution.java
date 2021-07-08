package Section4_递归和动态规划.回溯法.第980题_不同路径3;


public class Solution {

    public static int uniquePathsIII(int[][] grid) {
        int bushu = 1;
        boolean[][] judge = new boolean[grid.length][grid[0].length];
        int x = 0;
        int y = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    bushu++;
                }
                if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        return tmp_path(grid, bushu, judge, x, y);
    }

    public static int tmp_path(int[][] grid, int bushu, boolean[][] judge, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1 || judge[x][y]) {
            return 0;
        }
        if (bushu == 0) {
            if (grid[x][y] == 2) {
                return 1;
            }
            return 0;
        } else {
            judge[x][y] = true;
            int res = tmp_path(grid, bushu - 1, judge, x + 1, y) + tmp_path(grid, bushu - 1, judge, x, y + 1) +
                    tmp_path(grid, bushu - 1, judge, x - 1, y) + tmp_path(grid, bushu - 1, judge, x, y - 1);
            judge[x][y] = false;
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsIII(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}}));
    }
}
