package 第6章_面试中的各项能力.C_知识迁移能力.面试题61_扑克牌中的顺子;

import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        Arrays.sort(numbers);
        int length = 0;
        int sum = 0;
        int tmp = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                length++;
            }
        }
        if (length > 2) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                if (tmp == numbers[i]){
                    return false;
                }
                if (tmp != 0) {
                    sum += (numbers[i] - tmp - 1);
                }
                tmp = numbers[i];
            }
        }
        return sum <= length;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 4, 6, 7};
        Solution s = new Solution();
        System.out.println(s.isContinuous(arr));
    }
}