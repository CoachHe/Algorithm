package 第6章_面试中的各项能力.C_知识迁移能力.面试题56_数组中数字出现的次数;

public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || num1 == null || num2 == null || array.length == 0) {
            return;
        }
        if (array.length == 1) {
            num1[0] = array[0];
        }
        if (array.length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
        }
        int index = array[0];
        num1[0] = array[0];
        int he = 1;
        while (num1[0] == array[he]) {
            he++;
        }
        num2[0] = array[he];
        for (int i = 1; i < array.length; i++) {
            index ^= array[i];
        }
        int k = findK(index);
        for (int i = 1; i < array.length; i++) {
            if (i != he) {
                if ((array[i] >>> k) != 1) {
                    num1[0] ^= array[i];
                } else {
                    num2[0] ^= array[i];
                }
            }
        }
    }

    public int findK(int k) {
        int res = 0;
        while ((k & 1) == 0){
            res++;
            k = k >>> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 1, 3, 6};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        s.FindNumsAppearOnce(arr, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
//        System.out.println(s.findK(2));
    }
}