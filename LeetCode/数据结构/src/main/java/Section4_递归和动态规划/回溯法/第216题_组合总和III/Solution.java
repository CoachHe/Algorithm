package Section4_递归和动态规划.回溯法.第216题_组合总和III;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<List<Integer>> path = new LinkedList<>();
    Stack<Integer> tmp_path = new Stack<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        tmp_combination(k, n, 1, 0, 0);
        return path;
    }

    public void tmp_combination(int k, int n, int index, int tmp_sum, int len) {
        if (tmp_sum > n || len > k) {
            return;
        }
        if (len == k && tmp_sum == n) {
            path.add(new LinkedList<>(tmp_path));
        }
        for (int i = index; i <= 9; i++) {
            tmp_path.add(i);
            tmp_combination(k, n, i + 1, tmp_sum + i, len + 1);
            tmp_path.pop();
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.combinationSum3(3, 9));
        System.out.println(s.combinationSum3(3, 7));
    }
}
