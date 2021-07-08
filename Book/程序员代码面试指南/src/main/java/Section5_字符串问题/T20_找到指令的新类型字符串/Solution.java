package Section5_字符串问题.T20_找到指令的新类型字符串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String pointNewchar(String s, int k) {
        if (s == null || s.equals("") || k < 0 || k >= s.length()) {
            return "";
        }
        char[] chars = s.toCharArray();
        String res = "";
        char tmp = 0;
        for (int i = 0; i <= k; i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                res = tmp == 0 ? String.valueOf(chars[i]) : String.valueOf(tmp) + chars[i];
                tmp = 0;
            } else {
                if (tmp == 0) {
                    tmp = chars[i];
                    res = String.valueOf(tmp);
                } else {
                    res = String.valueOf(tmp) + chars[i];
                    tmp = 0;
                }
            }
        }
        if (res.toCharArray().length == 1 && res.toCharArray()[0] <= 'Z' && res.toCharArray()[0] >= 'A') {
            res += chars[k + 1];
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(pointNewchar("ABABA", 2));
    }
}
