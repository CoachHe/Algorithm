package 第6章_面试中的各项能力.C_知识迁移能力.面试题57_和为s的数字;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>(2);
        int length = array.length - 1;
        int begin = 0;
        int judge = Integer.MAX_VALUE;
        while (begin <= length) {
            if (array[begin] + array[length] > sum) {
                length--;
            } else if (array[begin] + array[length] == sum) {
                if (array[begin] * array[length] < judge) {
                    judge = array[begin] * array[length];
                    res.clear();
                    res.add(array[begin]);
                    res.add(array[length]);
                }
                begin++;
                length--;
            } else {
                begin++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(s.FindNumbersWithSum(arr, 21));
    }
}