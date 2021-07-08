package 第5章_优化时间和空间效率.第2节_时间效率.面试题40_最小的k个数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (treeMap.size() < k) {
                treeMap.put(input[i],i);
            } else if (input[i] < treeMap.lastKey()){
                treeMap.remove(treeMap.lastKey());
                treeMap.put(input[i],i);
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(treeMap.firstKey());
            treeMap.remove(treeMap.firstKey());
        }

        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 1, 6, 2, 7, 3, 8};
        Solution s = new Solution();
        ArrayList<Integer> arrayList = s.GetLeastNumbers_Solution(arr, 4);
        System.out.println(arrayList);
    }
}