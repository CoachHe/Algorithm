package Section8_数组和矩阵问题.P_奇数下标都是奇数或者偶数下表都是偶数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void modify(int[] arr) {
        int even = 0;
        int odd = 1;
        int tmp;
        while (even <= arr.length - 1 && odd <= arr.length - 1) {
            if (Math.floorMod(arr[arr.length - 1], 2) == 0) {
                tmp = arr[arr.length - 1];
                arr[arr.length - 1] = arr[even];
                arr[even] = tmp;
                even += 2;
            } else {
                tmp = arr[arr.length - 1];
                arr[arr.length - 1] = arr[odd];
                arr[odd] = tmp;
                odd += 2;
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
        modify(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
