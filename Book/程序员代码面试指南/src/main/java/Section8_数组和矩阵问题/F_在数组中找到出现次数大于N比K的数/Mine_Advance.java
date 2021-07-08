package Section8_数组和矩阵问题.F_在数组中找到出现次数大于N比K的数;

import java.util.HashMap;
import java.util.Map;

/**错误：
 * 1、没有考虑K<2的特殊情况
 * 2、没有重新遍历数组，从而得到正确的数量
 */
public class Mine_Advance {

    public static void printKMajor(int arr[], int K) {
        HashMap<Integer, Integer> cands = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (cands.containsKey(arr[i])) {
                cands.put(arr[i], cands.get(arr[i]) + 1);
            } else if (cands.size() == K - 1) {
                AllDeleteOne(cands);
            } else {
                cands.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : cands.entrySet()) {
            Integer key = set.getKey();
            boolean hasPrint = false;
            if (cands.get(key) > arr.length / K) {
                hasPrint = true;
                System.out.print(key + " ");
            }
            System.out.println(hasPrint ? "": "no such number" );
        }

    }

    public static void AllDeleteOne(HashMap<Integer, Integer> hashMap) {
        for (Map.Entry<Integer, Integer> set : hashMap.entrySet()) {
            if (set.getValue() == 1) {
                hashMap.remove(set);
            } else {
                hashMap.put(set.getKey(), set.getValue() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,2,3,1,1,1,1,1,2,1,2,1,1,2,2,2,2,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1};
        printKMajor(arr, 3);
    }

}


