package 第5章_优化时间和空间效率.第3节_时间效率与空间效率的平衡.面试题49_丑数;

import java.util.ArrayList;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int tmp = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        int num = 2;
        while (tmp != index) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (isUgly(num / arrayList.get(i)) && (num % arrayList.get(i) == 0)) {
                    arrayList.add(num);
                    tmp++;
                    break;
                }
            }
            num++;
        }
        return arrayList.get(index - 1);
    }

    public boolean isUgly(int i){
        return i == 1 || i == 2 || i == 3 || i == 5;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i = 0; i < 100; i++) {
            System.out.println(s.GetUglyNumber_Solution(i));
        }
        System.out.println(s.GetUglyNumber_Solution(1));
    }
}