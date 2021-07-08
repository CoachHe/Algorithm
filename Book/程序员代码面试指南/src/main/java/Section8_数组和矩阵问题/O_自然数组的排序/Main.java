package Section8_数组和矩阵问题.O_自然数组的排序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp;
            while (arr[i] != i + 1) {
                tmp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        sort(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
