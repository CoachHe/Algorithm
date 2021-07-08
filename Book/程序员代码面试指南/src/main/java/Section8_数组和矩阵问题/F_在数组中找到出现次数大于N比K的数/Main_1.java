package Section8_数组和矩阵问题.F_在数组中找到出现次数大于N比K的数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main_1 {
    public static void printNKMajor(int[] arr, int K) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (num.get(arr[i]) != null) {
                num.put(arr[i], num.get(arr[i]) + 1);
            } else {
                num.put(arr[i], 1);
            }
            if (num.size() == K - 1) {
                allDelOne(num);
            }
        }
        int tmp = 0;
        for (Map.Entry<Integer, Integer> set : num.entrySet()) {
            int value = set.getValue();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    tmp++;
                }
            }
            if (tmp > arr.length / K) {
                System.out.print(set.getKey() + " ");
            }
            tmp = 0;
        }
    }

    public static void allDelOne(HashMap<Integer, Integer> hashMap) {
        for (Map.Entry<Integer, Integer> set : hashMap.entrySet()) {
            Integer key = set.getKey();
            Integer value = set.getValue();
            if (value == 1) {
                hashMap.remove(key);
            } else {
                hashMap.put(key, value - 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);
        int[] arr = new int[n];
        strings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        printNKMajor(arr, k);
    }

}
