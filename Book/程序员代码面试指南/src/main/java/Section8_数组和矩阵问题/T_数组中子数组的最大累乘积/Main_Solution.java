package Section8_数组和矩阵问题.T_数组中子数组的最大累乘积;

public class Main_Solution {
    public static double maxProduct(double[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        double max = arr[0];
        double min = arr[0];
        double res = arr[0];
        double maxEnd = 0;
        double minEnd = 0;
        for (int i = 1; i < arr.length; i++) {
            maxEnd = max * arr[i];
            minEnd = min * arr[i];
            max = Math.max(Math.max(maxEnd, minEnd), arr[i]);
            min = Math.min(Math.min(maxEnd, minEnd), arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args) {
        Main_Solution m = new Main_Solution();
        double[] doubles = new double[]{10, 0.01, 100};
        System.out.println(maxProduct(doubles));
    }
}
