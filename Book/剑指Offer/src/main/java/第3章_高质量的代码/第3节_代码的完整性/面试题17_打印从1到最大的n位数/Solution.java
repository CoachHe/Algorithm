package 第3章_高质量的代码.第3节_代码的完整性.面试题17_打印从1到最大的n位数;

public class Solution {
    public int[] printNumbers(int n) {
        int Num = createNum(n);
        int[] arr = new int[Num];
        for (int i = 0; i < Num; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public int createNum(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += 9;
            if (i < n - 1) {
                res *= 10;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.createNum(3));
        int[] arr = s.printNumbers(2);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
