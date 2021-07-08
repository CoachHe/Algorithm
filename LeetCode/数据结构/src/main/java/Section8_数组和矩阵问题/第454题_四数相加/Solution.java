package Section8_数组和矩阵问题.第454题_四数相加;

class Solution {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int[] res = new int[1];
        tmpCount(A, B, C, D, 0, 0, 0, res);
        return res[0];
    }

    public void tmpCount(int[] A, int[] B, int[] C, int[] D, int sum, int tmpsum, int tmp, int[] res) {
        if (tmp == 4 && tmpsum == sum) {
            res[0]++;
        } else if (tmp == 4) {
            return;
        }
        if (tmp == 0) {
            for (int value : A) {
                tmpCount(A, B, C, D, sum, value, 1, res);
            }
        } else if (tmp == 1) {
            for (int value : B) {
                tmpCount(A, B, C, D, sum, tmpsum + value, 2, res);
            }
        } else if (tmp == 2) {
            for (int value : C) {
                tmpCount(A, B, C, D, sum, tmpsum + value, 3, res);
            }
        } else if (tmp == 3) {
            for (int value : D) {
                tmpCount(A, B, C, D, sum, tmpsum + value, 4, res);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = new int[]{1, 2};
        int[] B = new int[]{-2, -1};
        int[] C = new int[]{-1, 2};
        int[] D = new int[]{0, 2};
        System.out.println(s.fourSumCount(A, B, C, D));
    }
}