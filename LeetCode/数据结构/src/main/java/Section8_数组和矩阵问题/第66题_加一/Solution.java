package Section8_数组和矩阵问题.第66题_加一;

class Solution {
    public int[] plusOne(int[] digits) {
        int tmp = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + tmp == 10) {
                digits[i] = 0;
                tmp = 1;
            } else {
                digits[i] += tmp;
                tmp = 0;
            }
        }
        if (tmp == 1) {
            int[] tmpints = new int[digits.length + 1];
            for (int i = digits.length - 1; i >= 0; i--) {
                tmpints[i] = digits[i];
            }
            tmpints[0] = 1;
            return tmpints;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (int tmp : s.plusOne(new int[]{9})){
            System.out.print(tmp + " ");
        }
    }
}