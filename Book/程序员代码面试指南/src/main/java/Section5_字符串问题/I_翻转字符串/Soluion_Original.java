package Section5_字符串问题.I_翻转字符串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluion_Original {
    public static void rotateWord(char[] chas) {
//        reverse(chas, 0, chas.length);
        int tmp = 0;
        for (int i = 0; i < chas.length; i++) {
            if (chas[i] == ' ' || i == chas.length - 1) {
                reverse(chas, tmp, i == chas.length - 1 ? i + 1 : i);
                tmp = i + 1;
            }
        }
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        rotateWord(chars);
        System.out.println(chars);
    }
}
