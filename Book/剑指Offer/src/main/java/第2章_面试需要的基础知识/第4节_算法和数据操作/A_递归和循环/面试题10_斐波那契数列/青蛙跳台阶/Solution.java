package 第2章_面试需要的基础知识.第4节_算法和数据操作.A_递归和循环.面试题10_斐波那契数列.青蛙跳台阶;

public class Solution {
    public int JumpFloor(int target) {
        if(target == 1){
            return 1;
        } else if(target == 2){
            return 2;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}
