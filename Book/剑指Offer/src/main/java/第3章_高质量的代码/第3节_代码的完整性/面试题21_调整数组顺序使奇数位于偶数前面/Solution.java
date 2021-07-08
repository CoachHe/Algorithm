package 第3章_高质量的代码.第3节_代码的完整性.面试题21_调整数组顺序使奇数位于偶数前面;

import java.util.*;
public class Solution {
    public void reOrderArray(int [] array) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> doubleQueue = new LinkedList<>();
        for(int i = 0; i < array.length; i++){
            if((array[i] % 2) == 0){
                doubleQueue.add(array[i]);
            } else {
                oddQueue.add(array[i]);
            }
        }
        int index = 0;
        while(oddQueue.size() != 0){
            array[index++] = oddQueue.poll();
        }
        while(doubleQueue.size() != 0){
            array[index++] = doubleQueue.poll();
        }
    }
}