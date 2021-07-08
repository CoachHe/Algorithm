package Section8_数组和矩阵问题.K_未排序数组中累加和为给定值的最长子数组系列问题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution2 {
    public static int maxLength(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 1;
            } else if (arr[i] < 0) {
                arr[i] = -1;
            }
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        int sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hashMap.containsKey(sum - k)) {
                len = Math.max(i - hashMap.get(sum - k), len);
            }
            if (!hashMap.containsKey(sum)) {
                hashMap.put(sum, i);
            }
        }
        return len;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings1 = br.readLine().split(" ");
        int N = Integer.parseInt(strings1[0]);
        String[] strings2 = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strings2[i]);
        }
        System.out.println(maxLength(arr, 0));
    }
}
