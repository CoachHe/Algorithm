package Section8_数组和矩阵问题.X24_数组的partition调整;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void leftUnique(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int index = 0;
        int tmp = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                swap(arr, i, tmp++);
                index++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        leftUnique(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
