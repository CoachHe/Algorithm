package Section5_字符串问题.L_数组中两个字符串的最小距离;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Original {
    public static int minDistance(String[] strings, String string1, String string2) {
        if (string1 == null || string2 == null) {
            return -1;
        }
        if (string1.equals(string2)) {
            return 0;
        }
        int index1 = -1;
        int index2 = -1;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string1)) {
                index1 = i;
                minLen = Math.min(minLen, index2 == -1 ? minLen : i - index2);
            } else if (strings[i].equals(string2)) {
                index2 = i;
                minLen = Math.min(minLen, index1 == -1 ? minLen : i - index1);
            }
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        String string1 = strings[0];
        String string2 = strings[1];
        strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = br.readLine();
        }
        System.out.println(minDistance(strings, string1, string2));
    }
}
