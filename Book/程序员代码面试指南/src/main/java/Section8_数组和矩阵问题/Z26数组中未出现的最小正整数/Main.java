package Section8_数组和矩阵问题.Z26数组中未出现的最小正整数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int missNum(int[] arr) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            if (arr[l] == l + 1) {
                l++;
            } else if (arr[l] > l + 1) {
                if (arr[l] > r || arr[arr[l] - 1] == arr[l]) {
                    arr[l] = arr[--r];
                } else {
                    swap(arr, l, arr[l] - 1);
                }
            } else {
                arr[l] = arr[--r];
            }
        }

        return l + 1;
    }


    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(missNum(arr));
    }
}
