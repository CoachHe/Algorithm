package Section8_数组和矩阵问题.T_数组中子数组的最大累乘积;

//注意：该思路是错误的，因为没有考虑到情况[3,-1,4]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Mine {
    public static double maxProduct(double[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        double max = arr[0];
        double tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                tmp *= arr[i];
                max = Math.max(max, tmp);
            } else if (max < 0){
                max = 0;
                tmp = 1;
            } else {
                tmp = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(strings[i]);
        }
        System.out.println(maxProduct(arr));
    }
}
