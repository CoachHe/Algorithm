package 第6章_面试中的各项能力.C_知识迁移能力.面试题64_求1到N的和;

public class Solution {
    public int Sum_Solution(int n) {
        int sum = (int) (Math.pow(n, 2) + n);
        sum >>>= 1;
        return sum;
    }
}