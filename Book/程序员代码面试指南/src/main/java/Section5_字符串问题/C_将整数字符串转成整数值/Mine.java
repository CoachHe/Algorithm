package Section5_字符串问题.C_将整数字符串转成整数值;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine {
    public static boolean isValid(char[] chars) {
        if (chars == null || (chars != null && chars.length == 0)) {
            return false;
        }
        if (chars.length == 1 && chars[1] == '-' || chars[0] == '0') {
            return false;
        }
        for (int i = chars[0] == '-' ? 1 : 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static int convert(String string) {
        if (string == null || string.length() == 0) {
            return 0;
        }
        char[] chars = string.toCharArray();
        boolean posi = chars[0] == '-' ? false : true;
        int min = Integer.MIN_VALUE / 10;
        int rest = Integer.MIN_VALUE % 10;
        int cur = 0;
        int res = 0;
        if (!isValid(chars)) {
            return 0;
        }
        for (int i = chars[0] == '-' ? 1 : 0; i < string.length(); i++) {
            cur = '0' - chars[i];
            if (res < min) {
                return 0;
            }
            if (res == min && cur < rest) {
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
