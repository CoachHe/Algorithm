package Section8_数组和矩阵问题.J_未排序正数数组中累加和为给定值的最大子数组长度;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int maxLength(int[] nums, int k) {
        int tmpsum = 0;
        int firstindex = 0;
        int totalnum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            tmpsum += nums[i];
            while (tmpsum > k) {
                tmpsum -= nums[firstindex++];
            }
            if (tmpsum == k) {
                totalnum = Math.max(totalnum, i - firstindex + 1);
            }
        }
        return totalnum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int k = Integer.parseInt(str1[1]);
        String[] str2 = br.readLine().split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(str2[i]);
        }
        System.out.println(maxLength(nums, k));
    }
}
