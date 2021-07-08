package Section7_位运算.F_在其他数都出现k次的数组中找到只出现一次的数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int onceNum(int[] arr, int k) {
        int[][] res = new int[arr.length][32];
        int[] tmp;
        for (int i = 0; i < arr.length; i++) {
            tmp = Change_To_K(arr[i], k);
            for (int j = 0; j < tmp.length; j++) {
                res[i][j] = tmp[j];
            }
        }
        tmp = res[0];
        for (int i = 1; i < arr.length; i++) {
            tmp = add_Array(tmp, res[i], k);
        }
        int fi = K_To_n(tmp, k);
        return fi;
    }

    public static int[] Change_To_K(int n, int k) {
        int[] res = new int[32];
        int h = n / k;
        int i = 31;
        while (h != 0) {
            res[i--] = Math.floorMod(n,k);
            n /= k;
            h = n / k;
        }
        res[i] = Math.floorMod(n, k);
        return res;
    }

    public static int K_To_n(int[] res, int k) {
        int re = 0;
        for (int i = 31; i >= 0; i--) {
            if (res[i] != 0) {
                re += res[i] * Math.pow(k, 31 - i);
            }
        }
        return re;
    }

    public static int[] add_Array(int[] arr1, int[] arr2, int k) {
        int[] res = new int[32];
        for (int i = 0; i < 32; i++) {
            res[i] = Math.floorMod(arr1[i] + arr2[i], k);
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s = br.readLine())!=null) {
            String[] strings1 = s.split(" ");
            int n = Integer.parseInt(strings1[0]);
            int k = Integer.parseInt(strings1[1]);
            String[] strings2 = br.readLine().split(" ");
            int[] arr = new int[32];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strings2[i]);
            }
            System.out.println(onceNum(arr, k));
        }
    }

}
