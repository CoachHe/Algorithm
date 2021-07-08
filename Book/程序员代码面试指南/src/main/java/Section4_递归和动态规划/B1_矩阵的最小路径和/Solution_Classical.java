package Section4_递归和动态规划.B1_矩阵的最小路径和;

public class Solution_Classical {
    public int minPathSum1(int[][] m) {
        int[][] res = new int[m.length][m[0].length];
        res[0][0] = m[0][0];
        for (int i = 1; i < m.length; i++) {
            res[i][0] = res[i-1][0] + m[i][0];
        }
        for (int i = 1; i < m[0].length; i++) {
            res[0][i] = res[0][i-1] + m[0][i];
        }
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[0].length; j++) {
                res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + m[i][j];
            }
        }
        for (int[] i : res) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return res[m.length - 1][m[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] m = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        Solution_Classical s = new Solution_Classical();
        System.out.println(s.minPathSum1(m));
    }
}
