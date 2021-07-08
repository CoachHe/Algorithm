package Section8_数组和矩阵问题.第77题_组合;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution_Mine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<>();
        Stack<Integer> path = new Stack<>();
        tmp_path(1, n, k, res, path);
        return res;
    }

    public void tmp_path(int index, int n, int k, List<List<Integer>> paths, Stack<Integer> path) {
        int size = path.size();
        if (n - index < k - size - 1) {
            return;
        }
        if (size == k) {
            paths.add(new LinkedList<>(path));
            return;
        }
        for (int i = index; i <= n; i++) {
            path.add(i);
            tmp_path(i + 1, n, k, paths, path);
            path.pop();
        }
    }


    public static void main(String[] args) {
        Solution_Mine s = new Solution_Mine();
        List<List<Integer>> res = s.combine(4, 2);
        System.out.println(res);
    }
}
