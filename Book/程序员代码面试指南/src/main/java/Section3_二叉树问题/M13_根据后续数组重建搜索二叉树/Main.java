package Section3_二叉树问题.M13_根据后续数组重建搜索二叉树;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public boolean isPostArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        return isPost(arr, 0, arr.length - 1);
    }

    public boolean isPost(int[] arr, int start, int end) {
        if (start == end) {
            return true;
        }
        int s1 = start;
        while (start < end && arr[start] < arr[end]) {
            start++;
        }
        if (start == end) {
            return isPost(arr, s1, start - 1);
        }
        int s2 = start;
        while (start < end) {
            if (arr[start] < arr[end]) {
                return false;
            }
            start++;
        }

        return isPost(arr, s1, s2) && isPost(arr, s2, end - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        Main main = new Main();
        System.out.println(main.isPostArray(arr));
    }
}
