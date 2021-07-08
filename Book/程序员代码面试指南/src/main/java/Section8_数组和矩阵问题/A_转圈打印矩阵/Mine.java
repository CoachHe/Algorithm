package Section8_数组和矩阵问题.A_转圈打印矩阵;

public class Mine {

    public static void printCircle(int[][] matrix, int zuoshang_hang, int zuoshang_lie, int youxia_hang, int youxia_lie) {
        if (zuoshang_hang == youxia_hang) {         //行向量
            for (int i = zuoshang_lie; i < youxia_lie; i++) {
                System.out.print(matrix[zuoshang_hang][i] + " ");
            }
        } else if (zuoshang_lie == youxia_lie) {    //列向量
            for (int i = zuoshang_hang; i < youxia_hang; i++) {
                System.out.print(matrix[i][zuoshang_lie] + " ");
            }
        } else {                                    //正常矩阵
            int tmp_zuoshang_hang = zuoshang_hang;
            int tmp_zuoshang_lie = zuoshang_lie;
            while (zuoshang_lie != youxia_lie) {
                System.out.print(matrix[zuoshang_hang][zuoshang_lie] + " ");
                zuoshang_lie ++;
            }
            while (zuoshang_hang != youxia_hang) {
                System.out.print(matrix[zuoshang_hang][zuoshang_lie] + " ");
                zuoshang_hang ++;
            }
            while (youxia_lie != tmp_zuoshang_lie) {
                System.out.print(matrix[youxia_hang][youxia_lie] + " ");
                youxia_lie --;
            }
            while (youxia_hang != tmp_zuoshang_hang) {
                System.out.print(matrix[youxia_hang][youxia_lie] + " ");
                youxia_hang --;
            }
        }
    }

    public static void circle(int[][] matrix) {
        int length = matrix.length - 1;
        int height = matrix[0].length - 1;
        int zuoshang_hang = 0;
        int zuoshang_lie = 0;
        while ((zuoshang_hang <= length) && (zuoshang_lie <= height)) {
            printCircle(matrix, zuoshang_hang++, zuoshang_lie++, length--, height--);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        circle(matrix);
    }


}
