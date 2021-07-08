package 第2章_面试需要的基础知识.第3节_数据结构.A_数组.面试题3_数组中的重复数字;

public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || numbers.length < 1) {
            return false;
        }
        int res = 0;
        int index = 0;
        int end = length - 1;
        while (index <= end) {
            if (numbers[index] == index) {
                index++;
            } else if (numbers[index] < 0 || numbers[index] >= length) {
                return false;
            } else if (numbers[numbers[index]] == numbers[index]) {
                duplication[0] = numbers[index];
                return true;
            } else {
                swap(numbers, index, numbers[index]);
            }
        }
        return false;
    }

    public void swap(int[] numbers, int a, int b) {
        int tmp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = new int[]{2,1,3,1,4};
        int[] dupliactes = new int[numbers.length];
        System.out.println(s.duplicate(numbers, 5, dupliactes));
    }

}
