package Section8_数组和矩阵问题.H_最长的可整合子数组的长度;

import java.util.HashMap;
import java.util.HashSet;

public class Mine_HighMethod {
    public static int getLIL(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (hashSet.contains(arr[j])) {
                    break;
                }
                hashSet.add(arr[j]);
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
                if (max - min == j - i) {
                    len = Math.max(max - min + 1, len);
                }
            }
            hashSet.clear();
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,5,3,2,6,4,3};
        System.out.println(getLIL(arr));
    }

}
