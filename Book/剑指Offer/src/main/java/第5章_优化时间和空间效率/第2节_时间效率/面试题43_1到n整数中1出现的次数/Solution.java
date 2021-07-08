package 第5章_优化时间和空间效率.第2节_时间效率.面试题43_1到n整数中1出现的次数;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cp = n;
        int index = 0;
        int res = 0;
        while (n > 0) {
            index++;
            n /= 10;
        }
        res += num(cp, index);
        return res;
    }

    public int num(int num, int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        }
        int high = (int) (num / Math.pow(10, index - 1));
        int res = 0;
        if (high > 1) {
            res += Math.pow(10, index - 1);
        } else if (high == 1) {
            res += num - Math.pow(10, index - 1);
        }
        int high_l = (int) ( (num - high * Math.pow(10, index - 1)) / Math.pow(10, index - 2));
        index--;
        res += high_l * Math.pow(10, index - 2);
        res += num((int) (num - Math.pow(10, index - 1)), index);
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.NumberOf1Between1AndN_Solution(12));
    }
}