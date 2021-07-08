package Section5_字符串问题.C_将整数字符串转成整数值;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static boolean isValid(char[] chas) {
        if (chas[0] != '-' && (chas[0] < 0 || chas[0] > 9)) {
            return false;
        }
        if (chas[0] == '-' && (chas.length == 1 || chas[1] == '0')) {
            return false;
        }
        if (chas[0] == '0' && chas.length > 1) {
            return false;
        }
        for (int i = 1; i < chas.length; i++) {
            if (chas[i] < '0' || chas[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static int convert(String string) {
        if (string == null || string.equals("")) {
            return 0;
        }
        char[] chas = string.toCharArray();
        if (!isValid(chas)) {
            return 0;
        }
        boolean posi = chas[0] == '-' ? false : true;
        int ming = Integer.MIN_VALUE / 10;
        int minr = Integer.MIN_VALUE % 10;
        int res = 0;
        int cur = 0;
        for (int i = posi ? 0 : 1; i < chas.length; i++) {
            cur = '0' - chas[i];
            if ((res < ming) || res == ming && cur < minr) {
                return 0;
            }
            res = res * 10 + cur;
        }
        if (posi && res == Integer.MIN_VALUE) {
            return 0;
        }
        return posi ? -res : res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(convert(str));
    }
}
