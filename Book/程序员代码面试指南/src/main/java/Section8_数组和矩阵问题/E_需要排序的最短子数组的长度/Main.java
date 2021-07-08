package Section8_数组和矩阵问题.E_需要排序的最短子数组的长度;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int getMinLength(int[] arr) {
        int tmp = arr[arr.length - 1];
        int left_index = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (tmp > arr[i]) {
                tmp = arr[i];
            } else {
                left_index = i;
            }
        }
        if (left_index == -1) {
            return 0;
        }
        int right_index = -1;
        tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (tmp < arr[i]) {
                tmp = arr[i];
            } else {
                right_index = i;
            }
        }

        return right_index - left_index + 1;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(m.getMinLength(arr));
    }
}
