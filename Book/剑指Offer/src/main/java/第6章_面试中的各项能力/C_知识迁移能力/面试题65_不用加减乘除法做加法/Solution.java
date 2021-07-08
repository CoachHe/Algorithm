package 第6章_面试中的各项能力.C_知识迁移能力.面试题65_不用加减乘除法做加法;

public class Solution {
    public int Add(int num1,int num2) {
        int a = num1 ^ num2;
        int b = (num1 & num2) << 1;
        int tmp = 0;
        while (b != 0) {
            tmp = a ^ b;
            b = (a & b) << 1;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.Add(4,12));
        System.out.println(1 ^ 1);
    }
}