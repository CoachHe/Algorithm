package Section8_数组和矩阵问题.第64题_最小路径和;

class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null) {
            return -1;
        }
        return tmpPath(grid, 0, 0, 0);
    }

    public int tmpPath(int[][] grid, int tmpl, int tmpc, int path) {
        if (tmpc >= grid[0].length || tmpl >= grid.length || tmpc < 0 || tmpl < 0) {
            return Integer.MAX_VALUE;
        }
        if (tmpc == grid[0].length - 1 && tmpl == grid.length - 1) {
            return path + grid[tmpl][tmpc];
        }
        return Math.min(tmpPath(grid, tmpl + 1, tmpc, path + grid[tmpl][tmpc]), tmpPath(grid, tmpl, tmpc + 1, path + grid[tmpl][tmpc]));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(s.minPathSum(grid));
    }
}