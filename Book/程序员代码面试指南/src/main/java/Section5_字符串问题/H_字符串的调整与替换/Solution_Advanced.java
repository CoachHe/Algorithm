package Section5_字符串问题.H_字符串的调整与替换;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_Advanced {
    public static void modify(char[] chas) {
        if (chas == null || chas.length == 0) {
            return;
        }
        int k = chas.length - 1;
        for (int i = chas.length - 1; i >=0; i--) {
            if (chas[i] != '*') {
                chas[k--] = chas[i];
            }
        }
        for (int i = k; i >=0; i--) {
            chas[i] = '*';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chs = br.readLine().toCharArray();
        modify(chs);
        String s = String.valueOf(chs);
        System.out.println(s);
    }
}
