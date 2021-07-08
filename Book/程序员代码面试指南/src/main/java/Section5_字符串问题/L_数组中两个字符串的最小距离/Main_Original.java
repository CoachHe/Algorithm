package Section5_字符串问题.L_数组中两个字符串的最小距离;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Original {
    public static int minDistance(String[] strs, String str1, String str2) {
        int len = Integer.MAX_VALUE;
        int last_index1 = -1;
        int last_index2 = -1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str1)) {
                len = Math.min(len, last_index2 == -1 ? len : i - last_index2);
                last_index1 = i;
            } else if (strs[i].equals(str2)) {
                len = Math.min(len, last_index1 == -1 ? len : i - last_index1);
                last_index2 = i;
            }
        }
        if (last_index1 == -1 || last_index2 == -1) {
            return -1;
        }
        return len;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        String str1 = strings[0];
        String str2 = strings[1];
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = br.readLine();
        }
        System.out.println(minDistance(strs, str1, str2));
    }
}
