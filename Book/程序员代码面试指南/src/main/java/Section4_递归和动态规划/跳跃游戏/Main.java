package Section4_递归和动态规划.跳跃游戏;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int minStep(int[] arr) {
        int cur = 0;
        int next = 0;
        int jump = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cur < i) {
                cur = next;
                jump++;
            }
            next = Math.max(next, arr[i] + i);
        }
        return jump;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(minStep(arr));
    }
}
