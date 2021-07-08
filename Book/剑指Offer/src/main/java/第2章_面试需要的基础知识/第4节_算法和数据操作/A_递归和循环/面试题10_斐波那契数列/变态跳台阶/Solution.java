package 第2章_面试需要的基础知识.第4节_算法和数据操作.A_递归和循环.面试题10_斐波那契数列.变态跳台阶;

public class Solution {
    public int JumpFloorII(int target) {
        if (target < 1) {
            return 0;
        } else if (target <= 2) {
            return target;
        }
        int res = 0;
        for (int i = 0; i < target; i++) {
            res += JumpFloorII(i);
        }
        return res + 1;
    }

}
