package 第2章_面试需要的基础知识.第4节_算法和数据操作.A_递归和循环.面试题10_斐波那契数列.扩展_矩阵覆盖;

public class Solution {
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }
}