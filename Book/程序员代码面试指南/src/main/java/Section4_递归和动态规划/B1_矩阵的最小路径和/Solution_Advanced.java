package Section4_递归和动态规划.B1_矩阵的最小路径和;

public class Solution_Advanced {
    public int minPathSum2(int[][] m) {
        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
            return 0;
        }
        int more = Math.max(m.length, m[0].length);
        int less = Math.min(m.length, m[0].length);
        boolean rowmore = more == m.length;
        int[] arr = new int[less];
        arr[0] = m[0][0];
        for (int i = 1; i < less; i++) {
            arr[i] = arr[i - 1] + (rowmore ? m[0][i] : m[i][0]);
        }
        for (int i = 1; i < more; i++) {
            arr[0] = arr[0] + (rowmore ? m[i][0] : m[0][i]);
            for (int j = 1; j < less; j++) {
                arr[j] = Math.min(arr[j - 1], arr[j]) + (rowmore ? m[i][j] : m[j][i]);
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        return arr[less - 1];
    }

    public static void main(String[] args) {
        int[][] m = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        Solution_Advanced s = new Solution_Advanced();
        System.out.println(s.minPathSum2(m));
    }
}
