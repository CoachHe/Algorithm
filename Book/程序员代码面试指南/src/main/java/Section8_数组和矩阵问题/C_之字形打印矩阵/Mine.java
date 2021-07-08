package Section8_数组和矩阵问题.C_之字形打印矩阵;


public class Mine {

    public static void printZig(int[][] matrix) {
        int end_hang = matrix.length - 1;
        int end_lie = matrix[0].length - 1;
        int you_hang = 0;
        int you_lie = 0;
        int xia_hang = 0;
        int xia_lie = 0;
        boolean f = false;
        while (you_hang <= end_hang) {
            printLevel(matrix, you_hang, you_lie, xia_hang, xia_lie, f);
            you_hang = you_lie == end_lie ? you_hang + 1 : you_hang;
            you_lie = you_lie == end_lie ? you_lie : you_lie + 1;
            xia_lie = xia_hang == end_hang ? xia_lie + 1 : xia_lie;
            xia_hang = xia_hang == end_hang ? xia_hang : xia_hang + 1;
            f = !f;
        }

    }

    public static void printLevel(int[][] matrix, int you_hang, int you_lie, int xia_hang, int xia_lie, boolean f) {
        if (f) {
            for (int i = 0; i <= xia_hang - you_hang; i++) {
                System.out.print(matrix[you_hang + i][you_lie - i] + " ");
            }
        } else {
            for (int i = 0; i <= xia_hang - you_hang; i++) {
                System.out.print(matrix[xia_hang - i][xia_lie + i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        printZig(matrix);
    }

}
