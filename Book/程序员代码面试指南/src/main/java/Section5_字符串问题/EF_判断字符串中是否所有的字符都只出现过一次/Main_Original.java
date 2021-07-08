package Section5_字符串问题.EF_判断字符串中是否所有的字符都只出现过一次;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main_Original {
    public static String isUnique1(int[] arr) {
        if (arr.length <= 1) {
            return "YES";
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args)throws IOException{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        String res=isUnique1(arr);
        System.out.println(res);
    }
}
