package Section5_字符串问题.D_字符串的统计字符串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_Original {
    public static String getCountString(String string) {
        char[] chars = string.toCharArray();
        String re = "";
        int k = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                k++;
                re = i == chars.length - 1 ? re + chars[i] + "_" + k : re;
            } else if (chars[i] != chars[i - 1]) {
                re = i == chars.length - 1 ? re + chars[i - 1] + "_" + k + "_" + chars[i] + "_" + 1 :
                        re + chars[i - 1] + "_" + k + "_";
                k = 1;
            }
        }
        return re;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        System.out.println(getCountString(s));
    }
}
