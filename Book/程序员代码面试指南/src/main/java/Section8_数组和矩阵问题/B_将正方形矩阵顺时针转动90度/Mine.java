package Section8_数组和矩阵问题.B_将正方形矩阵顺时针转动90度;

public class Mine {

    public static void change90degree(int[][] matrix, int zuoshang_hang, int zuoshang_lie, int youxia_hang, int youxia_lie) {
        int tmp = 0;
        for (int i = 0; i < youxia_hang - zuoshang_hang; i++) {
            tmp = matrix[zuoshang_hang][zuoshang_lie + i];
            matrix[zuoshang_hang][zuoshang_lie + i] = matrix[youxia_hang - i][zuoshang_lie];
            matrix[youxia_hang - i][zuoshang_lie] = matrix[youxia_hang][youxia_lie - i];
            matrix[youxia_hang][youxia_lie - i] = matrix[zuoshang_hang + i][youxia_lie];
            matrix[zuoshang_hang + i][youxia_lie] = tmp;
        }
    }

    public static void solute(int[][] matrix) {
        int length = matrix.length - 1;
        int k = 0;
        while (length > 0) {
            change90degree(matrix, k, k, length, length);
            k ++;
            length --;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        solute(matrix);
    }

}
