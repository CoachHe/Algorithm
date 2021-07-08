package Section8_数组和矩阵问题.X24_数组的partition调整;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_Advanced {
    public static void sort(int[] arr, int k) {
        int begin = 0;
        int end = arr.length - 1;
        int tmp = 0;
        while (tmp <= end) {
            if (arr[tmp] > k) {
                swap(arr, tmp, end--);
            } else if (arr[tmp] < k) {
                swap(arr, tmp++, begin++);
            } else {
                tmp++;
            }
        }
        while (begin < end) {
            arr[begin++] = k;
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
        sort(arr, 1);
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
