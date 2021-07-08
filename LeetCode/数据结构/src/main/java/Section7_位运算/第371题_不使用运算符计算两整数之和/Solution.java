package Section7_位运算.第371题_不使用运算符计算两整数之和;

public class Solution {
    public int getSum(int a, int b) {
        int t;
        while (b != 0) {
             t = a ^ b;
             b = (a & b) << 1;
             a = t;
        }
        t = a ^ b;
        return t;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.getSum(2, 3);
        System.out.println(s.getSum(2,3));
        System.out.println((2 & 3) << 1);
    }
}
