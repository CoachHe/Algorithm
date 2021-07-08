package Section9_其他题目.V22_判断一个数是否是回文数;

import java.io.*;

public class Main2 {
    public static boolean isPalindrome(int n) {
        if (n == 0) {
            return true;
        }
        n = Math.abs(n);
        int length = 0;
        for (int i = 1; i < n; i = i * 10) {
            length++;
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = n % 10;
            n = n / 10;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(isPalindrome(n) ? "Yes" : "No");
    }
}
