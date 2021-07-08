package Section5_字符串问题.G_在有序但含有空的数组中查找字符串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine {
    public static int getIndex(String[] strings, String string) {
        if (strings == null || strings.length == 0 || string == null) {
            return -1;
        }
        int left = 0;
        int right = strings.length - 1;
        int mid = 0;
        int res = -1;
        int i = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (strings[mid] != null && strings[mid].equals(string)) {
                res = mid;
                right = mid - 1;
            } else if (strings[mid] != null && strings[mid].compareTo(string) < 0) {
                left = mid + 1;
            } else if (strings[mid] != null && strings[mid].compareTo(string) > 0) {
                right = mid - 1;
            } else {
                i = mid;
                while (strings[i] == null && --i >= left) {
                    ;
                }
                if (i < left || strings[i].compareTo(string) < 0) {
                    left = mid + 1;
                } else {
                    res = strings[i].equals(string) ? i : res;
                    right = i - 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        String str = b.readLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = b.readLine();
            arr[i] = arr[i].equals("0") ? null : arr[i];
        }
        b.close();

        System.out.println(getIndex(arr, str));
    }
}
