package 第6章_面试中的各项能力.C_知识迁移能力.面试题66_构建乘积数组;

import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] C = new int[A.length];
        int[] D = new int[A.length];
        int[] res = new int[A.length];
        int tmp = 1;
        C[0] = 1;
        for (int i = 1; i < A.length; i++) {
            tmp *= A[i - 1];
            C[i] = tmp;
        }
        tmp = 1;
        D[A.length - 1] = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            tmp *= A[i + 1];
            D[i] = tmp;
        }
        for (int i = 0; i < A.length; i++) {
            res[i] = C[i] * D[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = new int[]{1,2,3,4,5};
        int[] D = s.multiply(A);
        for (int tmp : D) {
            System.out.print(tmp + " ");
        }
    }
}