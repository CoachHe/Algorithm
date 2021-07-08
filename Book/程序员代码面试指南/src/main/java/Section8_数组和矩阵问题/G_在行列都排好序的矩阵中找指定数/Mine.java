package Section8_数组和矩阵问题.G_在行列都排好序的矩阵中找指定数;

public class Mine {
    public static boolean isContain(int[][] matrix, int K) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col > -1) {
            if (K == matrix[row][col]) {
                return true;
            } else if (K < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1,2,5},{2,3,4,7},{4,4,4,8},{5,7,7,9}};
        System.out.println(isContain(matrix, 6));
    }

}
