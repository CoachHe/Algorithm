package Section4_递归和动态规划.B1_矩阵的最小路径和;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine_Advanced {
    public static int minPathSum(int[][] m){
        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
            return 0;
        }
        int more = Math.max(m.length, m[0].length);
        int less = Math.min(m.length, m[0].length);
        boolean rowmore = m.length >= m[0].length;
        int[] arr = new int[less];
        arr[0] = m[0][0];
        for (int i = 1; i < less; i++) {
            arr[i] = arr[i-1] + (rowmore ? m[0][i] : m[i][0]);
        }
        for (int i = 1; i < more; i++) {
            arr[0] += (rowmore ? m [i][0] :  m[0][i]);
            for (int j = 1; j < less; j++) {
                arr[j] = Math.min(arr[j-1], arr[j]) + (rowmore ? m[i][j] : m[j][i]);
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        return arr[less - 1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");
        int row = Integer.parseInt(strs[0]);
        int col = Integer.parseInt(strs[1]);
        int[][] a = new int[row][col];
        for(int i = 0;i<row;i++){
            strs = br.readLine().split(" ");
            for(int j = 0;j<col;j++)
                a[i][j] = Integer.parseInt(strs[j]);
        }
        System.out.println(minPathSum(a));
    }
}
