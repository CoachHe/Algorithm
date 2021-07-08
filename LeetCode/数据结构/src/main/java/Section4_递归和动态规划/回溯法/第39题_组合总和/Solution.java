package Section4_递归和动态规划.回溯法.第39题_组合总和;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<List<Integer>> paths = new LinkedList<>();
    Stack<Integer> stack = new Stack<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        tmp_com(candidates, target, 0, 0);
        return paths;
    }

    public void tmp_com(int[] candidates, int target, int tmp_sum, int index) {
        if (index >= candidates.length || tmp_sum > target) {
            return;
        }
        if (tmp_sum == target) {
            paths.add(new LinkedList<>(stack));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            stack.push(candidates[i]);
            tmp_com(candidates, target, tmp_sum + candidates[i], i);
            stack.pop();
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
//        System.out.println(s.combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(s.combinationSum(new int[]{2, 3, 5}, 8));
    }
}
