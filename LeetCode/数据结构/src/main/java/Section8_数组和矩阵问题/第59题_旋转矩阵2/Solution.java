package Section8_数组和矩阵问题.第59题_旋转矩阵2;

public class Solution {
    public int[][] generateMatrix(int n) {
        if (n <= 0) {
            return null;
        }
        int[][] res = new int[n][n];
        int k = generateOne(res);
        int i = 1;
        while (i <= n / 2) {
            k = generateMore(res, k, i);
            i++;
        }
        return res;
    }

    public int generateOne(int[][] arr) {
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[0][i] = k++;
        }
        for (int i = 1; i < arr[0].length; i++) {
            arr[i][arr.length - 1] = k++;
        }
        for (int i = arr.length - 2; i > 0; i--) {
            arr[arr.length - 1][i] = k++;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i][0] = k++;
        }
        return k;
    }

    public int generateMore(int[][] arr, int k, int n) {
        for (int i = n; i < arr.length - n; i++) {
            arr[n][i] = k++;
        }
        for (int i = n + 1; i < arr[0].length - n; i++) {
            arr[i][arr.length - 1 - n] = k++;
        }
        for (int i = arr.length - 2 - n; i > n; i--) {
            arr[arr.length - 1 - n][i] = k++;
        }
        for (int i = arr.length - 1 - n; i > n; i--) {
            arr[i][n] = k++;
        }
        return k;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = s.generateMatrix(1);
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}