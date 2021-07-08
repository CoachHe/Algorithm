package Section5_字符串问题.I_翻转字符串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_Advanced {
    public static void rotate2(char[] chas, int size) {
        reverse(chas, 0, chas.length);
        reverse(chas, 0, chas.length - size);
        reverse(chas, chas.length - size, chas.length);
    }


    public static void reverse(char[] chas, int begin, int end) {
        char tmp;
        int k = 1;
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            tmp = chas[i];
            chas[i] = chas[end - k];
            chas[end - k] = tmp;
            k++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Integer n= Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        char[] chars = s.toCharArray();
        rotate2(chars, n);
        System.out.println(chars);
    }
}
